package zadaniaString_big_decimal;

import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika łańcuch znaków str.
//Usuwa z łańcucha wszystkie spacje i zamienia litery na małe (użyj metod replaceAll() i toLowerCase()).
//Sprawdza, czy str jest palindromem (czytany od przodu i od tyłu jest taki sam).
//Wyświetla odpowiedni komunikat.

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj łańcuch znaków: ");
        String str = scanner.nextLine();

        if (str.isBlank()) {
            System.out.println("Błąd: Wpisz niepusty łańcuch znaków.");
            return;
        }

        String processed = str.replaceAll("\\s", "").toLowerCase();
        String reversed = new StringBuilder(processed).reverse().toString();

        if (processed.equals(reversed)) {
            System.out.println("Podany łańcuch jest palindromem.");
        } else {
            System.out.println("Podany łańcuch nie jest palindromem.");
        }
    }
}
