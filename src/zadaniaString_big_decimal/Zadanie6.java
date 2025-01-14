package zadaniaString_big_decimal;

import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika dwa łańcuchy znaków str1 i str2.
//Sprawdza, czy łańcuchy znaków są takie same bez względu na wielkość liter (użyj metody equalsIgnoreCase()).
//Wyświetla odpowiedni komunikat.

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszy łańcuch znaków: ");
        String str1 = scanner.nextLine();
        System.out.print("Podaj drugi łańcuch znaków: ");
        String str2 = scanner.nextLine();

        if (str1.isBlank() || str2.isBlank()) {
            System.out.println("Błąd: Żaden z łańcuchów nie może być pusty.");
            return;
        }

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Łańcuchy są takie same (niezależnie od wielkości liter).");
        } else {
            System.out.println("Łańcuchy różnią się.");
        }
    }
}
