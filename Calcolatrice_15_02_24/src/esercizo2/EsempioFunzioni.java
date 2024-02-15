package esercizo2;

import java.util.Scanner;

public class EsempioFunzioni {

    public static double sommaDueNumeri(double n1, double n2){
        return n1 + n2;
    }

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci il primo addendo");
        double n1 = Double.parseDouble(tastiera.nextLine());
        System.out.println("Inserisci il secondo addendo");
        double n2 = Double.parseDouble(tastiera.nextLine());
        double somma = sommaDueNumeri(n1,n2);
        System.out.println("Il risultato della somma è: " + somma);
    }
}
