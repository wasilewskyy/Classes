package zadaniaString_big_decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika kwotę w dolarach amerykańskich (USD) jako String, np. "100.00".
//Konwertuje kwotę na obiekt BigDecimal.
//Przelicza kwotę na euro (EUR) przy założeniu stałego kursu wymiany, np. 1 USD = 0.85 EUR (użyj metody multiply()).
//Zaokrągla wynik do dwóch miejsc po przecinku (użyj metody setScale() i RoundingMode).
//Wyświetla kwotę w euro.

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj kwotę w dolarach (USD): ");
        String usdInput = scanner.nextLine();

        BigDecimal usd = Validator.validateAndParseBigDecimal(usdInput);
        if (usd == null) {
            return;
        }

        BigDecimal exchangeRate = new BigDecimal("0.85");
        BigDecimal eur = usd.multiply(exchangeRate).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Kwota w euro (EUR): " + eur);
    }
}