package zadaniaString_big_decimal;

import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika łańcuch znaków str.
//Zamienia wszystkie wystąpienia litery a na literę e (użyj metody replace()).
//Wyświetla oryginalny i zmodyfikowany łańcuch.

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj łańcuch znaków: ");
        String str = scanner.nextLine();

        if (str.isBlank()) {
            System.out.println("Błąd: Podany łańcuch znaków jest pusty.");
            return;
        }

        String replaced = str.replace('a', 'e');

        if (str.equals(replaced)) {
            System.out.println("Łańcuch nie zawiera znaku 'a', więc nie dokonano żadnych zmian.");
        } else {
            System.out.println("Oryginalny łańcuch: " + str);
            System.out.println("Zmodyfikowany łańcuch: " + replaced);
        }
    }
}