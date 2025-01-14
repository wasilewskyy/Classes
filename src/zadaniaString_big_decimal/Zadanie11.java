package zadaniaString_big_decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika cenę produktu jako String, np. "19.99".
//Konwertuje cenę na obiekt BigDecimal.
//Dodaje podatek VAT 23% do ceny (użyj metody multiply() i odpowiedniego RoundingMode).
//Wyświetla cenę brutto z dokładnością do dwóch miejsc po przecinku.

public class Zadanie11 {
    private static final BigDecimal VAT_RATE = new BigDecimal("0.23");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj cenę produktu (np. 19.99): ");
        String priceInput = scanner.nextLine();

        BigDecimal price = validateAndParsePrice(priceInput);
        if (price == null) {
            return;
        }

        BigDecimal priceWithVat = calculatePriceWithVat(price);
        System.out.println("Cena brutto z VAT: " + priceWithVat);
    }

    private static BigDecimal calculatePriceWithVat(BigDecimal price) {
        return price.add(price.multiply(VAT_RATE)).setScale(2, RoundingMode.HALF_UP);
    }

    private static BigDecimal validateAndParsePrice(String priceInput) {
        try {
            return new BigDecimal(priceInput);
        } catch (NumberFormatException e) {
            System.out.println("Podana wartość nie jest poprawną liczbą. Spróbuj ponownie.");
            return null;
        }
    }
}