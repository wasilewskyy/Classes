package zadaniaString_big_decimal;

import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika łańcuch znaków text.
//Usuwa z text wszystkie znaki interpunkcyjne (kropki, przecinki, wykrzykniki, pytajniki itp.).
//Zamienia wielokrotne spacje na pojedyncze (użyj metody replaceAll() z wyrażeniami regularnymi).
//Wyświetla sformatowany tekst.

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String text = scanner.nextLine();

        String noPunctuation = text.replaceAll("[.,!?]", "");
        String singleSpaces = noPunctuation.replaceAll("\\s+", " ");

        System.out.println("Sformatowany tekst: " + singleSpaces.trim());
    }
}
