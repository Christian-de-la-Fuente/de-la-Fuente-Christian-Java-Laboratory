package esercizio4;

import java.util.Scanner;

/**
 * @author Christian de la Fuente
 * Classe che chieda nella calcolatrice se si vuole rieseguire un calcolo
 */

public class CalcolatriceRepetibile {
    public static void main(String[] args) {
        System.out.println("Scegli una tra le seguenti operazioni:\n" +
                "\t 1) SOMMA\n \t 2) DIFFERENZA\n \t 3) PRODOTTO\n \t 4) DIVISIONE\n" +
                "\t 5) SENO\n \t 6) COSENO\n \t 7) TANGENTE\n");
        Scanner tastiera = new Scanner(System.in);
        int operatore = Integer.parseInt(tastiera.nextLine());
        boolean condizione = true;
        do{
            switch(operatore){
                case 1:
                    System.out.println("Inserisci il primo addendo");
                    int primoAddendo = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Inserisci il secondo addendo");
                    int secondoAddendo = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Somma: " + (primoAddendo + secondoAddendo));
                    System.out.println("Rieseguire calcolo?");
                    String riesegueSomma = tastiera.nextLine();
                    if(riesegueSomma.equalsIgnoreCase("y")){
                        break;
                    }else {
                        condizione = false;
                        break;
                    }
                case 2:
                    System.out.println("Inserisci il primo sottraendo");
                    int primoSottraendo = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Inserisci il secondo Sottraendo");
                    int secondoSottraendo = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Sottrazione: " + (primoSottraendo - secondoSottraendo));
                    System.out.println("Rieseguire calcolo?");
                    String riesegueSottrazione = tastiera.nextLine();
                    if(riesegueSottrazione.equalsIgnoreCase("y")){
                        break;
                    }else {
                        condizione = false;
                        break;
                    }
                case 3:
                    System.out.println("Inserisci il primo fattore");
                    int primoFattore = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Inserisci il secondo fattore");
                    int secondoFattore = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Moltiplicazione: " + (primoFattore * secondoFattore));
                    System.out.println("Rieseguire calcolo?");
                    String riesegueMoltiplicazione = tastiera.nextLine();
                    if(riesegueMoltiplicazione.equalsIgnoreCase("y")){
                        break;
                    }else {
                        condizione = false;
                        break;
                    }
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
                    System.out.println("Rieseguire calcolo?");
                    String riesegueDivisione = tastiera.nextLine();
                    if(riesegueDivisione.equalsIgnoreCase("y")){
                        break;
                    }else {
                        condizione = false;
                        break;
                    }
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
        } while(condizione); // end while
    } // end main
} // end class
