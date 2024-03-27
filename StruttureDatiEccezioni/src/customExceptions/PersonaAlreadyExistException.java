package customExceptions;

public class PersonaAlreadyExistException extends Exception{
    public static final String EXC_MESSAGE = "Quella persona è già inserita";

    public PersonaAlreadyExistException() {
    }

    public PersonaAlreadyExistException(String message) {
        super(message);
    }
}
