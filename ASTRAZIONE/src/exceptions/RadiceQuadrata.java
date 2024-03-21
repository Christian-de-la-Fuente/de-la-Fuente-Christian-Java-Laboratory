package exceptions;

import java.util.Scanner;

public class RadiceQuadrata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Inserisci numero:");
            int n = Integer.parseInt(sc.nextLine());
            if(n >= 0){
                double r = Math.sqrt(n);
                System.out.println("La radice quadrata di " + n + " è: " + r);
            }else{
                throw new Exception("Non si può fare la radice quadrata di un numero negativo");
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
