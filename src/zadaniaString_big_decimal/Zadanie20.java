package zadaniaString_big_decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika licznik i mianownik (jako String), np. "10" i "3".
//Konwertuje wartości na obiekty BigDecimal.
//Dzieli licznik przez mianownik, używając różnych trybów zaokrąglania (RoundingMode.HALF_UP, RoundingMode.HALF_DOWN, RoundingMode.CEILING, RoundingMode.FLOOR).
//Wyświetla wyniki dla każdego trybu zaokrąglania z dokładnością do dwóch miejsc po przecinku.

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj licznik: ");
        String numeratorInput = scanner.nextLine();
        System.out.print("Podaj mianownik: ");
        String denominatorInput = scanner.nextLine();

        BigDecimal numerator = new BigDecimal(numeratorInput);
        BigDecimal denominator = new BigDecimal(denominatorInput);

        System.out.println("RoundingMode.HALF_UP: " + numerator.divide(denominator, 2, RoundingMode.HALF_UP));
        System.out.println("RoundingMode.HALF_DOWN: " + numerator.divide(denominator, 2, RoundingMode.HALF_DOWN));
        System.out.println("RoundingMode.CEILING: " + numerator.divide(denominator, 2, RoundingMode.CEILING));
        System.out.println("RoundingMode.FLOOR: " + numerator.divide(denominator, 2, RoundingMode.FLOOR));
    }
}
