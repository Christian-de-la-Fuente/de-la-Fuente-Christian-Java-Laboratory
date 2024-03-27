package lists;

import customExceptions.PersonaNotFoundException;
import objects.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PersonList {

    public static boolean searchPerson(List<Person> personList, String codiceFiscale){
        Person person = null;
        try{
            person = personList
                    .stream()
                    .filter(p -> p.getCodiceFiscale().equals(codiceFiscale))
                    .findFirst()
                    .orElse(null);
            if(person == null){
                throw new PersonaNotFoundException(PersonaNotFoundException.EXC_MESSAGE);
            }
            return true;
        }catch(PersonaNotFoundException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public static boolean searchPersonByDate(List<Person> personList, String dataNascita){
        return true;
    }
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        personList.add(new Person("Jules", "Verne", "MN569J2HR4NF", LocalDate.of(1828, 2, 8)));
        personList.add(new Person("Arthur Conan", "Doyle", "3H7FNT502PO4", LocalDate.of(1859, 5, 22)));
        personList.add(new Person("Emilio", "Salgari", "J47GN3M2O98N", LocalDate.of(1862, 8, 21)));
        personList.add(new Person("Agatha", "Christie", "HYU5732NHR8U", LocalDate.of(1890, 9, 15)));
        personList.add(new Person("John Ronald Reuel", "Tolkien", "3HB43J23BGYU", LocalDate.of(1892, 1, 3)));


        // Esercizio 2.2
        /*try{
            System.out.println("Inserisci nome");
            String nome = sc.nextLine();
            System.out.println("Inserisci cognome");
            String cognome = sc.nextLine();
            System.out.println("Inserisci codice fiscale");
            String codiceFiscale = sc.nextLine();
            LocalDate data = LocalDate.now();
            for (Objects.Person person : personList) {
                if(Objects.equals(person.getCodiceFiscale(), codiceFiscale)){
                    throw new customExceptions.PersonaAlreadyExistException(customExceptions.PersonaAlreadyExistException.EXC_MESSAGE);
                }
            }
            personList.add(new Objects.Person(nome, cognome, codiceFiscale, data));
            System.out.println(personList);
        }catch(customExceptions.PersonaAlreadyExistException ex){
            System.out.println(ex.getMessage());
        }*/
    }
}
