package esercizio3;

import java.util.Scanner;

/**
 * @author Christian de la Fuente
 * Classe che implementi la calcolatrice del secondo esercizio ma utilizzando delle funzioni per implementare
 * le operazioni
 */

public class CalcolatriceConFunzioni {

    public static double sommaDueNumeri(double n1, double n2){
        return n1 + n2;
    }

    public static void main(String[] args) {
        System.out.println("Scegli una tra le seguenti operazioni:\n" +
                "\t 1) SOMMA\n \t 2) DIFFERENZA\n \t 3) PRODOTTO\n \t 4) DIVISIONE\n" +
                "\t 5) SENO\n \t 6) COSENO\n \t 7) TANGENTE\n");
        Scanner tastiera = new Scanner(System.in);
        int operatore = Integer.parseInt(tastiera.nextLine());
    } // end main
} // end class
