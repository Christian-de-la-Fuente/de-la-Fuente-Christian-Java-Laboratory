package customExceptions;

public class PersonaNotFoundException extends Exception{
    public static final String EXC_MESSAGE = "Persona non trovata";

    public PersonaNotFoundException() {
    }

    public PersonaNotFoundException(String message) {
        super(message);
    }
}
