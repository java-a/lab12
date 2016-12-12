package exception;

public class FormatException extends Exception {
    private String message;

    public FormatException() {
        this.message = "Format error.";
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
