package esercizi;

public class Leone extends Animale{

    private String suonoleone = "Grande ruggito";

    public Leone(String suonoleone) {
        this.suonoleone = suonoleone;
    }

    @Override
    public String sound() {
        return suonoleone;
    }
}
