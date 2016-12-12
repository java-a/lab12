package exception;

public class NameFormatException extends FormatException {
    private String value;
    private int index;

    public NameFormatException(String value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public String getMessage() {
        return "The char: " + value + "[" + index + "] is illegal.";
    }
}
