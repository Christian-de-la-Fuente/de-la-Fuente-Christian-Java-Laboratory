import interfaces.IMisurePoligono;

public class Quadrato implements IMisurePoligono {

    private double lato;

    public Quadrato(){}

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    @Override
    public double calcolaPerimetro() {
        return this.lato * 4;
    }

    @Override
    public double calcolaArea() {
        return Math.pow(this.lato, 2);
    }
}
