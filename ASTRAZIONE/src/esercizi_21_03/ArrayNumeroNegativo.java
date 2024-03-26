package esercizi_21_03;

public class ArrayNumeroNegativo {

        public static void checkForNegativeNumbers(int[] array) throws Exception {
            for (int num : array) {
                if (num < 0) {
                    throw new Exception("Numero negativo trovato: " + num);
                }
            }
        }


    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, 5};

        try {
            checkForNegativeNumbers(array);
            System.out.println("Nessun numero negativo trovato.");
        } catch (Exception ex) {
            System.out.println("Eccezione: " + ex.getMessage());
        }
    }
}
