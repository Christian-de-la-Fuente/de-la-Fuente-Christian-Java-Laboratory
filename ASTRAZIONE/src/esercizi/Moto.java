package esercizi;

public class Moto extends Vehicle{

    private String avvioMoto = "Mettere la chiave nella moto";
    private String ArrestoMoto = "Togliere la chiave della moto";

    public Moto(String avvioMoto, String arrestoMoto) {
        this.avvioMoto = avvioMoto;
        ArrestoMoto = arrestoMoto;
    }

    @Override
    public String startEngine() {
        return avvioMoto;
    }

    @Override
    public String stopEngine() {
        return ArrestoMoto;
    }
}
