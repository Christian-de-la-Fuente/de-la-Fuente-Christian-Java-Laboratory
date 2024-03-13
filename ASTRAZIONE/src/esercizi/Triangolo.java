package esercizi;

public class Triangolo extends Poligono{

    private int numeroLati = 3;

    public Triangolo() {
    }

    public Triangolo(double numeroLati) {
        super(numeroLati);
    }

    @Override
    public double calcolaPerimetro() {
        return numeroLati * getNumeroLati();
    }
}
