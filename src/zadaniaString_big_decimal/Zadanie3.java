package zadaniaString_big_decimal;

import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika łańcuch znaków str.
//Usuwa początkowe i końcowe spacje z łańcucha (użyj metody trim()).
//Konwertuje łańcuch na wielkie litery (użyj metody toUpperCase()).
//Wyświetla wynik.

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj łańcuch znaków: ");
        String str = scanner.nextLine();

        if (str.isBlank()) {
            System.out.println("Błąd: Podany łańcuch znaków jest pusty lub zawiera tylko białe znaki.");
            return; // Zakończenie działania programu
        }

        String trimmed = str.trim();
        String upperCase = trimmed.toUpperCase();
        System.out.println("Przekształcony łańcuch: " + upperCase);
    }
}