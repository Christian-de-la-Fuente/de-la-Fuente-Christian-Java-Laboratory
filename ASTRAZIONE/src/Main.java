public class Main {
    public static void main(String[] args) {
        // dichiaro un'istanza di un oggetto di tipo (o della classe) Quadrato q1
        Quadrato q1 = new Quadrato();
        // assegno all'oggetto q1, il valore 5.0 richiamando il metodo dell'istanza
        // dell'oggetto q1
        q1.setLato(5.0);
        System.out.println("L'area del quadrato è: " + q1.calcolaArea());
        System.out.println("Il perimetro del quadrato è: " + q1.calcolaPerimetro());
    }
}