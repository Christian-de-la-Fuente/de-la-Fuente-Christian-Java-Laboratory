package exceptions;

import java.util.Scanner;

public class DivisioneMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("inserisci dividendo: ");
            double dividendo = Double.parseDouble(sc.nextLine());
            System.out.println("inserisci divisore: ");
            double divisore = Double.parseDouble(sc.nextLine());
            if(divisore == 0){
                throw new DivisonByZeroException(DivisonByZeroException.EXC_MESSAGE);
            }
            double risultato = dividendo / divisore;
            System.out.println("Il risultato è: " + risultato);
        }catch(DivisonByZeroException ex){
            System.out.println("Exception message: " + ex.getMessage());
        }

    }
}
