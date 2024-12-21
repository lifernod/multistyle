package parser.utils;

public class StringUtils {

    public static int countOccurrences(String string, String pattern) {
        return string.length() - string.replace(pattern, "").length();
    }
}
