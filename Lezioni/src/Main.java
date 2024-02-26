import lezione_26_02.Persona;

public class Main {
    public static void main(String[] args) {
        Persona miaPersona = new Persona("Christian", "de la Fuente", 24);
        System.out.println(miaPersona);

        miaPersona.nomePersona = ""; // accesso publico


        Persona secondaPersona = new Persona("Alberto", "Mastropiero");
        System.out.println(secondaPersona);
    }
}