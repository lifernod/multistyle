package files;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static List<String> readFile(Path path) throws IOException {
        File file = new File(path.toUri());
        if (!file.exists()) {
            throw new FileNotFoundException("Failed to found file " + path);
        }

        List<String> content = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.lines()
                    .forEach((line) -> {
                        if (!line.isEmpty() || !line.isBlank()) {
                            content.add(line.trim());
                        }
                    });
        } catch (Exception e) {
            throw new IOException("Failed to read path " + path);
        }


        return content;
    }
}
