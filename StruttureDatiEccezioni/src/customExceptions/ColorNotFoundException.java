package customExceptions;

public class ColorNotFoundException extends Exception{
    public static final String EXC_MESSAGE = "Non c'è quel colore";

    public ColorNotFoundException() {
    }

    public ColorNotFoundException(String message) {
        super(message);
    }
}
