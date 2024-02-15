package esercizio1;

import java.util.Scanner;

/**
 * @author Christian de la Fuente
 * Classe che implemente il primo esercizio che si occupa di creare una calcolatrice classica, ovvero,
 * una calcolatrice che implementa le cuattro operazioni fondamentali
 */

public class CalcolatriceClassica {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci il primo addendo");
        int primoAddendo = Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci il secondo addendo");
        int secondoAddendo = Integer.parseInt(tastiera.nextLine());
        System.out.println("Somma: " + (primoAddendo + secondoAddendo));
        System.out.println("Inserisci il primo sottraendo");
        int primoSottraendo = Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci il secondo Sottraendo");
        int secondoSottraendo = Integer.parseInt(tastiera.nextLine());
        System.out.println("Sottrazione: " + (primoSottraendo - secondoSottraendo));
        System.out.println("Inserisci il primo fattore");
        int primoFattore = Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci il secondo fattore");
        int secondoFattore = Integer.parseInt(tastiera.nextLine());
        System.out.println("Moltiplicazione: " + (primoFattore * secondoFattore));
        System.out.println("Inserisci il dividendo");
        double dividendo = Double.parseDouble(tastiera.nextLine());
        System.out.println("Inserisci il divisore");
        double divisore = Double.parseDouble(tastiera.nextLine());
        if (divisore == 0){
            System.out.println("Divisione impossibile");
        }else{
            System.out.println("Divisione: " + (dividendo / divisore));
        }
    } // end main
} // end class
