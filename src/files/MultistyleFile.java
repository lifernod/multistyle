package files;

import parser.tokens.Token;
import parser.tokens.TokenType;
import parser.utils.StringUtils;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MultistyleFile {

    private final Path inputFilePath;
    private List<Token> tokens;

    public MultistyleFile(String path) throws IOException {
        this.inputFilePath = Paths.get(path);
        this.tokenizeFile();
    }

    private List<Token> tokenizeFile() throws IOException {
        List<String> fileContent = Reader.readFile(this.inputFilePath);

        List<Token> tokens = new ArrayList<>(fileContent.size() + 1);

        ListIterator<String> iterator = fileContent.listIterator();
        while (iterator.hasNext()) {
            int line = iterator.nextIndex() + 1;
            String item = iterator.next();

            // Single > means that it is a block opening/closing tag e.g. <colors>
            // Two > means that it is a block item e.g. <foo>#bazz</foo>
            int closing = StringUtils.countOccurrences(item, ">");
            if (closing == 1) {

                if (item.contains("/")) {
                    tokens.add(TokenType.colorBlockClose(line));
                } else {
                    tokens.add(TokenType.colorBlockOpen(line));
                }

            } else if (closing == 2) {
                String name = item.substring(
                        item.indexOf("<"),
                        item.indexOf(">") + 1
                );

                String value = item.substring(
                        item.indexOf(">") + 1,
                        item.lastIndexOf("<")
                );

                // TODO: handle unrecognized tokens
                Token token = switch (name) {
                    case "colors" -> TokenType.colorBlockOpen(line);
                    case "/colors" -> TokenType.colorBlockClose(line);
                    default -> TokenType.colorItem(line, name, value);
                };

                tokens.add(token);
            }
        }
        this.tokens = tokens;
        return tokens;
    }

    // public only for development
    public void displayTokens() {
        for (Token token : this.tokens) {
            System.out.println(
                    "[TOKEN " + token.type + "]: " + token.name + " - " + token.raw + " at line " + token.line
            );
        }
    }
}
