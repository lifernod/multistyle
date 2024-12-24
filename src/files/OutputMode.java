package files;

public enum OutputMode {
    css;
    // TODO: in future here will be more output modes

    public static OutputMode fromString(String string) {
        if (string.equalsIgnoreCase("css")) {
            return css;
        } else {
            throw new RuntimeException("Unrecognized output mode: " + string);
        }
    }
}
