package esercizi;

public class Auto extends Vehicle{

    private String avvioMacchina = "Mettere la chiave nell'auto";
    private String arrestoMacchina = "Togliere la chiave dell'auto";

    public Auto(String avvioMacchina, String arrestoMacchina) {
        this.avvioMacchina = avvioMacchina;
        this.arrestoMacchina = arrestoMacchina;
    }

    @Override
    public String startEngine() {
        return avvioMacchina;
    }

    @Override
    public String stopEngine() {
        return arrestoMacchina;
    }
}
