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
        System.out.print("Enter numerator: ");
        String numeratorInput = scanner.nextLine();
        System.out.print("Enter denominator: ");
        String denominatorInput = scanner.nextLine();

        if (denominatorInput.equals("0")) {
            System.out.println("Error: Denominator cannot be zero.");
            return;
        }

        try {
            BigDecimal numerator = new BigDecimal(numeratorInput);
            BigDecimal denominator = new BigDecimal(denominatorInput);

            printDivisionResult(numerator, denominator, RoundingMode.HALF_UP);
            printDivisionResult(numerator, denominator, RoundingMode.HALF_DOWN);
            printDivisionResult(numerator, denominator, RoundingMode.CEILING);
            printDivisionResult(numerator, denominator, RoundingMode.FLOOR);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number input.");
        }
    }

    private static void printDivisionResult(BigDecimal numerator, BigDecimal denominator, RoundingMode roundingMode) {
        BigDecimal result = numerator.divide(denominator, 2, roundingMode);
        System.out.println(roundingMode.name() + ": " + result);
    }
}
