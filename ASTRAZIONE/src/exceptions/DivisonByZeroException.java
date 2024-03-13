package exceptions;

public class DivisonByZeroException extends Exception{
    public static final String EXC_MESSAGE = "DIVISIONE PER ZERO IMPOSSIBILE!";

    public DivisonByZeroException() {
    }

    public DivisonByZeroException(String message) {
        super(message);
    }
}
