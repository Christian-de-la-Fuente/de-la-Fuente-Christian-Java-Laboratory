package lezione_26_02.esercizi;

public class ContoCorrenteBancario {
    private String nomeCliente;
    private String cognomeCliente;
    private Double soldiCliente;

    public ContoCorrenteBancario(){

    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente(String nomeCliente){
        return this.nomeCliente;
    }

    public void setCognomeCliente(String cognomeCliente){
        this.cognomeCliente = cognomeCliente;
    }

    public String getCognomeCliente(String cognomeCliente){
        return this.cognomeCliente;
    }

    public void setSoldiCliente(Double soldiCliente){
        this.soldiCliente = soldiCliente;
    }

    public Double getSoldiCliente(Double soldiCliente){
        return this.soldiCliente;
    }

    @Override
    public String toString() {
        return "ContoCorrenteBancario{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", cognomeCliente='" + cognomeCliente + '\'' +
                ", soldiCliente=" + (soldiCliente == null ? 0 : soldiCliente) +
                '}';
    }
}
