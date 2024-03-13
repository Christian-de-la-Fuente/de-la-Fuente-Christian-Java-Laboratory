package esercizi;

public class Tigre extends Animale{

    private String suonoTigre = "ruggito";

    public Tigre(String suonoTigre) {
        this.suonoTigre = suonoTigre;
    }

    @Override
    public String sound() {
        return suonoTigre;
    }
}
