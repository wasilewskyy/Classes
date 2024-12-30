package zadaniaString_big_decimal;

import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika łańcuch znaków text.
//Zlicza liczbę samogłosek i spółgłosek w text.
//Wyświetla wyniki.

public class Zadanie18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String text = scanner.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;
        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Liczba samogłosek: " + vowels);
        System.out.println("Liczba spółgłosek: " + consonants);
    }
}
