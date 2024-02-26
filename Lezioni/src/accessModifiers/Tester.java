package accessModifiers;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scuola primaria = new Scuola();
        System.out.println("Inserisci il nome della scuola:");
        primaria.setNomeScuola(sc.nextLine());

        System.out.println(primaria);
    }
}
