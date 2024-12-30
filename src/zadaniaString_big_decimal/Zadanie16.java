package zadaniaString_big_decimal;

import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika łańcuch znaków reprezentujący numer ISBN-10 (10 cyfr).
//Sprawdza, czy numer jest prawidłowy, stosując algorytm weryfikacji ISBN-10.
//Wyświetla odpowiedni komunikat.

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj numer ISBN-10 (10 cyfr): ");
        String isbn = scanner.nextLine();

        if (isbn.length() != 10 || !isbn.matches("\\d{9}[\\dX]")) {
            System.out.println("Nieprawidłowy format ISBN-10.");
            return;
        }

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (isbn.charAt(i) - '0') * (10 - i);
        }
        char lastChar = isbn.charAt(9);
        sum += (lastChar == 'X') ? 10 : (lastChar - '0');

        if (sum % 11 == 0) {
            System.out.println("Numer ISBN-10 jest prawidłowy.");
        } else {
            System.out.println("Numer ISBN-10 jest nieprawidłowy.");
        }
    }
}