package zadaniaWyjatki;

import java.util.Scanner;

//Napisz program, który konwertuje łańcuch znaków podany przez użytkownika na liczbę całkowitą za pomocą metody Integer.parseInt().
// Obsłuż wyjątek NumberFormatException (wyjątek niekontrolowany) za pomocą try-catch.
// Zademonstruj różnicę między wyjątkiem kontrolowanym a niekontrolowanym, wyjaśniając, dlaczego NumberFormatException nie musi być zadeklarowany w sygnaturze metody.

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Liczba: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Wprowadź prawidłową liczbę całkowitą.");
        }
    }
}
