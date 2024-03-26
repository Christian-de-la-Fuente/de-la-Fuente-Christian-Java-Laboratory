package esercizi_21_03;

import java.util.Scanner;

public class Vocali {
    public static void checkForVowels(String str) throws Exception {
        if (!containsVowels(str)) {
            throw new Exception("La stringa non contiene vocali.");
        }
    }

    public static boolean containsVowels(String str) {
        return str.matches(".*[aeiouAEIOU].*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Scrivi qualcosa");
            String str = sc.nextLine();
            checkForVowels(str);
            System.out.println("La stringa '" + str + "' contiene vocali.");
        } catch (Exception ex) {
            System.out.println("Eccezione: " + ex.getMessage());
        }

    }
}
