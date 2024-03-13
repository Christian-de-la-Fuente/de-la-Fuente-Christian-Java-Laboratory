package esercizi;

public abstract class Poligono {

    private double numeroLati;

    public Poligono() {
    }

    public Poligono(double numeroLati) {
        this.numeroLati = numeroLati;
    }

    public double getNumeroLati() {
        return numeroLati;
    }

    public void setNumeroLati(double numeroLati) {
        this.numeroLati = numeroLati;
    }

    public abstract double calcolaPerimetro();
}
