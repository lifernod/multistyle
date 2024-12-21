import files.MultistyleFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MultistyleFile file = new MultistyleFile("D://projects//multistyles//examples//example.txt");
        file.displayTokens();
    }
}