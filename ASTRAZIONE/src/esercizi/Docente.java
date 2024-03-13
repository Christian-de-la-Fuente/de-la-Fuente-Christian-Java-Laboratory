package esercizi;

public class Docente extends Dipendente{

    private String ruolo = "Docente";

    public Docente(String nome, String cognome, double stipendio, String ruolo) {
        super(nome, cognome, stipendio);
        this.ruolo = ruolo;
    }

    @Override
    public String ruoloDipendente() {
        return ruolo;
    }
}
