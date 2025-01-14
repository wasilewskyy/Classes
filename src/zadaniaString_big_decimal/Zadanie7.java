package zadaniaString_big_decimal;

import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika łańcuch znaków filename.
//Sprawdza, czy filename zaczyna się od "data_" i kończy na ".txt" (użyj metod startsWith() i endsWith()).
//Wyświetla odpowiedni komunikat.

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj nazwę pliku: ");
        String filename = scanner.nextLine();

        if (filename.isBlank()) {
            System.out.println("Błąd: Nazwa pliku nie może być pusta.");
            return;
        }

        if (filename.startsWith("data_") && filename.endsWith(".txt")) {
            System.out.println("Plik spełnia warunki (rozpoczyna się od \"data_\" i kończy na \".txt\").");
        } else {
            System.out.println("Plik nie spełnia warunków.");
        }
    }
}

