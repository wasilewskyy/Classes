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

//Wyjaśnienie:
//
//NumberFormatException:
//Jest to wyjątek niekontrolowany (czyli unchecked exception), który dziedziczy po RuntimeException.
//Wyjątki niekontrolowane nie muszą być zadeklarowane w sygnaturze metody (np. w throws), ponieważ są to błędy, które mogą wystąpić w czasie wykonywania programu.
//Wyjątki kontrolowane (np. IOException), które są związane z problemami z wejściem/wyjściem, NumberFormatException wskazuje na problem w logice aplikacji, czyli nieprawidłowy format danych wejściowych.
