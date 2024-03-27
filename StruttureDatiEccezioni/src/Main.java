import lists.PersonList;
import objects.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jules", "Verne", "MN569J2HR4NF", LocalDate.of(1828, 2, 8)));
        personList.add(new Person("Arthur Conan", "Doyle", "3H7FNT502PO4", LocalDate.of(1859, 5, 22)));
        personList.add(new Person("Emilio", "Salgari", "J47GN3M2O98N", LocalDate.of(1862, 8, 21)));
        personList.add(new Person("Agatha", "Christie", "HYU5732NHR8U", LocalDate.of(1890, 9, 15)));
        personList.add(new Person("John Ronald Reuel", "Tolkien", "3HB43J23BGYU", LocalDate.of(1892, 1, 3)));

        System.out.println("Inserisci codice fiscale");
        String codiceFiscale = sc.nextLine();
        // lists.PersonList.searchPerson(personList, codiceFiscale);
        System.out.println(PersonList.searchPerson(personList, codiceFiscale));
    }
}