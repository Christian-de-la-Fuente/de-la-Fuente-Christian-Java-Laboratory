package accessModifiers;

public class Scuola {
    private String nomeScuola;
    private String indirizzoScuola;
    private String gradoScuola;

    public Scuola(String nomeScuola, String indirizzoScuola, String gradoScuola){
        this.nomeScuola = nomeScuola;
        this.indirizzoScuola = indirizzoScuola;
        this.gradoScuola = gradoScuola;
    }

    public Scuola(){

    }

    public void setNomeScuola(String nomeScuola){
        this.nomeScuola = nomeScuola;
    }

    public String getNomeScuola(){
        return this.nomeScuola;
    }

    public void setIndirizzoScuolaScuola(String indirizzoScuola){
        this.indirizzoScuola = indirizzoScuola;
    }

    public String getIndirizzoScuolaScuola(){
        return this.indirizzoScuola;
    }

    public void setGradoScuolacuola(String gradoScuola){
        this.gradoScuola = gradoScuola;
    }

    public String getGradoScuolaScuola(){
        return this.gradoScuola;
    }

    @Override
    public String toString() {
        return "Scuola{" +
                "nomeScuola='" + nomeScuola + '\'' +
                ", indirizzoScuola='" + indirizzoScuola + '\'' +
                ", gradoScuola='" + gradoScuola + '\'' +
                '}';
    }
}
