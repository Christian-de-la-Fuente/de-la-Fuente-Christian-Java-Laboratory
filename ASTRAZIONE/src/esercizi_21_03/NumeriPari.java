package esercizi_21_03;

import java.util.Scanner;

public class NumeriPari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Inserisci un numero");
            int n = Integer.parseInt(sc.nextLine());
            if(n % 2 == 0)
                throw new Exception("Il numero è pare");
            System.out.println(n);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
