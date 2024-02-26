package lezione_26_02;

/**
 * @author Christian de la Fuente
 */
public class Persona {
    public String nomePersona;
    public String cognomePersona;
    public Integer etaPersona;
    protected String coloreCapelli;

    public Persona(){

    }

    /**
     * Costruttore
     * @param nomePersona nome della persona con cui si vuole istanziare l'oggetto
     * @param cognomePersona cognome della persona con cui si vuole istanziare l'oggetto
     */
    public Persona(String nomePersona, String cognomePersona){
        this.nomePersona = nomePersona;
        this.cognomePersona = cognomePersona;
    }

    /**
     * Costruttore
     * @param nomePersona nome della persona con cui si vuole istanziare l'oggetto
     * @param cognomePersona cognome della persona con cui si vuole istanziare l'oggetto
     * @param etaPersona età della persona con cui si vuole istanziare l'oggetto
     */
    public Persona(String nomePersona, String cognomePersona, Integer etaPersona){
        this.nomePersona = nomePersona;
        this.cognomePersona = cognomePersona;
        this.etaPersona = etaPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nomePersona='" + nomePersona + '\'' +
                ", cognomePersona='" + cognomePersona + '\'' +
                ", etaPersona=" + (etaPersona == null ? 0 : etaPersona) +
                ", coloreCapelli='" + coloreCapelli + '\'' +
                '}';
    }
}
