package esercizi;

public abstract class Dipendente {

    private String nome;
    private String cognome;
    private double stipendio;

    public Dipendente() {
    }

    public Dipendente(String nome, String cognome, double stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public abstract String ruoloDipendente();
}
