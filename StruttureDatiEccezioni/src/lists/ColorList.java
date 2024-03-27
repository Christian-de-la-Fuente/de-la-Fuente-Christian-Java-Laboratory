package lists;

import customExceptions.ColorNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColorList {

    public static boolean searchColor(List<String> colorList, String c){
        /*boolean ris = false;
        for (String color : colorList) {
            if(Objects.equals(color, c)){
                ris = true;
            }
        }
        return ris;*/
        return colorList.contains(c) ? true : false;
        
    }

    /*public static int indexOfColor(List<String> colorList, String c){
        try{
            if(!colorList.contains(c)){
                throw new ColorNotFoundException();
            }
            return
        }catch(ColorNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }*/
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>(List.of("Rosso", "Arancione", "Giallo", "Verde"));
        Scanner sc = new Scanner(System.in);
        try{
            // Esercizio 1.1
        /*for (String color : colorList) {
            System.out.println("Colore: " + color);
        }*/
            System.out.println("Cerca colore");
            String cerca = sc.nextLine();
            // Esercizio 1.2
            // System.out.println(searchColor(colorList, cerca));
            // Esercizio 1.3
            int index = colorList.indexOf(cerca);
            if(index > -1){
                System.out.println(index);
            }else{
                throw new ColorNotFoundException(ColorNotFoundException.EXC_MESSAGE);
            }
        }catch(ColorNotFoundException ex){
            System.out.println(ex.getMessage());
        }

    }
}
