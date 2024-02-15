package esercizio2;

import java.util.Scanner;

/**
 * @author Christian de la Fuente
 * Classe che implementi la calcolatrice del primo esercizio ma aggiungendo anche le funzioni trigonometriche
 */

public class CalcolatriceTrigonometrica {
    public static void main(String[] args) {
        System.out.println("Scegli una tra le seguenti operazioni:\n" +
                "\t 1) SOMMA\n \t 2) DIFFERENZA\n \t 3) PRODOTTO\n \t 4) DIVISIONE\n" +
                "\t 5) SENO\n \t 6) COSENO\n \t 7) TANGENTE\n");
        Scanner tastiera = new Scanner(System.in);
        int operatore = Integer.parseInt(tastiera.nextLine());
        switch(operatore){
            case 1:
                System.out.println("Inserisci il primo addendo");
                int primoAddendo = Integer.parseInt(tastiera.nextLine());
                System.out.println("Inserisci il secondo addendo");
                int secondoAddendo = Integer.parseInt(tastiera.nextLine());
                System.out.println("Somma: " + (primoAddendo + secondoAddendo));
                break;
            case 2:
                System.out.println("Inserisci il primo sottraendo");
                int primoSottraendo = Integer.parseInt(tastiera.nextLine());
                System.out.println("Inserisci il secondo Sottraendo");
                int secondoSottraendo = Integer.parseInt(tastiera.nextLine());
                System.out.println("Sottrazione: " + (primoSottraendo - secondoSottraendo));
                break;
            case 3:
                System.out.println("Inserisci il primo fattore");
                int primoFattore = Integer.parseInt(tastiera.nextLine());
                System.out.println("Inserisci il secondo fattore");
                int secondoFattore = Integer.parseInt(tastiera.nextLine());
                System.out.println("Moltiplicazione: " + (primoFattore * secondoFattore));
                break;
            case 4:
                System.out.println("Inserisci il dividendo");
                double dividendo = Double.parseDouble(tastiera.nextLine());
                System.out.println("Inserisci il divisore");
                double divisore = Double.parseDouble(tastiera.nextLine());
                if (divisore == 0){
                    System.out.println("Divisione impossibile");
                }else{
                    System.out.println("Divisione: " + (dividendo / divisore));
                }
                break;
            case 5:
                System.out.println("Inserisci il grado per calcolare il seno");
                double gradoSeno = Double.parseDouble(tastiera.nextLine());
                double radianteSeno = Math.toRadians(gradoSeno);
                System.out.println("Seno: " + (Math.sin(radianteSeno)));
                break;
            case 6:
                System.out.println("Inserisci il grado per calcolare il coseno");
                double gradoCoseno = Double.parseDouble(tastiera.nextLine());
                double radianteCoseno = Math.toRadians(gradoCoseno);
                System.out.println("Seno: " + (Math.cos(radianteCoseno)));
                break;
            case 7:
                System.out.println("Inserisci il grado per calcolare la tangente");
                double gradoTangente = Double.parseDouble(tastiera.nextLine());
                double radianteTangente = Math.toRadians(gradoTangente);
                System.out.println("Seno: " + (Math.tan(radianteTangente)));
                break;
            default:
                //il default valuta e esegue le istruziono dei casi non presenti
                System.out.println("Scegli una delle operazioni");
                break;
        } // end switch
        /*System.out.println("Inserisci il primo addendo");
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
        System.out.println("Inserisci la radiante");
        double radiante = Double.parseDouble(tastiera.nextLine());
        System.out.println("Seno: " + (Math.sin(radiante)));
        System.out.println("Coseno: " + (Math.cos(radiante)));
        System.out.println("Tangente: " + (Math.tan(radiante)));*/
    } // end main
} // end class
