package esercizio2;

import java.util.Scanner;

/**
 * @author Christian de la Fuente
 * Classe che implementi la calcolatrice del primo esercizio ma aggiungendo anche le funzioni trigonometriche
 * ma senza switch
 */

public class CalcolatriceTrigunometricaSenzaSwitch {
    public static void main(String[] args) {
        System.out.println("Scegli una tra le seguenti operazioni:\n" +
                "\t 1) SOMMA\n \t 2) DIFFERENZA\n \t 3) PRODOTTO\n \t 4) DIVISIONE\n" +
                "\t 5) SENO\n \t 6) COSENO\n \t 7) TANGENTE\n");
        Scanner tastiera = new Scanner(System.in);
        int operatore = Integer.parseInt(tastiera.nextLine());
        if (operatore == 1){
            System.out.println("Inserisci il primo addendo");
            int primoAddendo = Integer.parseInt(tastiera.nextLine());
            System.out.println("Inserisci il secondo addendo");
            int secondoAddendo = Integer.parseInt(tastiera.nextLine());
            System.out.println("Somma: " + (primoAddendo + secondoAddendo));
        }else if (operatore == 2){
            System.out.println("Inserisci il primo sottraendo");
            int primoSottraendo = Integer.parseInt(tastiera.nextLine());
            System.out.println("Inserisci il secondo Sottraendo");
            int secondoSottraendo = Integer.parseInt(tastiera.nextLine());
            System.out.println("Sottrazione: " + (primoSottraendo - secondoSottraendo));
        }else if (operatore == 3){
            System.out.println("Inserisci il primo fattore");
            int primoFattore = Integer.parseInt(tastiera.nextLine());
            System.out.println("Inserisci il secondo fattore");
            int secondoFattore = Integer.parseInt(tastiera.nextLine());
            System.out.println("Moltiplicazione: " + (primoFattore * secondoFattore));
        }else if (operatore == 4){
            System.out.println("Inserisci il dividendo");
            double dividendo = Double.parseDouble(tastiera.nextLine());
            System.out.println("Inserisci il divisore");
            double divisore = Double.parseDouble(tastiera.nextLine());
            if (divisore == 0){
                System.out.println("Divisione impossibile");
            }else{
                System.out.println("Divisione: " + (dividendo / divisore));
            }
        }else if (operatore == 5){
            System.out.println("Inserisci la radiante");
            double gradoSeno = Double.parseDouble(tastiera.nextLine());
            double radianteSeno = Math.toRadians(gradoSeno);
            System.out.println("Seno: " + (Math.sin(radianteSeno)));
        }else if (operatore == 6){
            System.out.println("Inserisci la radiante");
            double gradoCoseno = Double.parseDouble(tastiera.nextLine());
            double radianteCoseno = Math.toRadians(gradoCoseno);
            System.out.println("Seno: " + (Math.cos(radianteCoseno)));
        }else if (operatore == 7){
            System.out.println("Inserisci la radiante");
            double gradoTangente = Double.parseDouble(tastiera.nextLine());
            double radianteTangente = Math.toRadians(gradoTangente);
            System.out.println("Seno: " + (Math.tan(radianteTangente)));
        }else{
            System.out.println("Scegli una delle operazioni");
        } // end if
    }
}
