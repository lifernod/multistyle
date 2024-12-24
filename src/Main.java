import files.MultistyleFile;
import files.OutputMode;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            throw new RuntimeException("0 args provided. Expected >1");
        }

        if (args[0].equalsIgnoreCase("build")) {
            build(args);
        }
    }

    private static void build(String[] args) {
        try {
            String mode = args[1];
            String from = args[3];

            MultistyleFile file = new MultistyleFile(from);
            OutputMode outputMode = OutputMode.fromString(mode);

            file.outputFile(outputMode);

        } catch (ArrayIndexOutOfBoundsException | IOException e) {
            // TODO: add error handling
            throw new RuntimeException(e);
        }
    }
}