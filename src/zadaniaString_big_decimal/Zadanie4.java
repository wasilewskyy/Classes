package zadaniaString_big_decimal;

import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika łańcuch znaków text oraz podłańcuch subtext.
//Sprawdza, czy text zawiera subtext (użyj metody contains()).
//Jeśli tak, wyświetla indeks pierwszego wystąpienia subtext w text (użyj metody indexOf()).
//Jeśli nie, wyświetla odpowiedni komunikat.

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String text = scanner.nextLine();
        System.out.print("Podaj podłańcuch: ");
        String subtext = scanner.nextLine();

        if (text.isBlank()) {
            System.out.println("Błąd: Tekst nie może być pusty.");
            return;
        }

        if (subtext.isBlank()) {
            System.out.println("Błąd: Podłańcuch nie może być pusty.");
            return;
        }

        if (text.contains(subtext)) {
            System.out.println("Podłańcuch znaleziony na pozycji: " + text.indexOf(subtext));
        } else {
            System.out.println("Podłańcuch nie występuje w tekście.");
        }
    }
}
