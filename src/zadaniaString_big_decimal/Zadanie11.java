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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj cenę produktu (np. 19.99): ");
        String priceInput = scanner.nextLine();

        BigDecimal price = new BigDecimal(priceInput);
        BigDecimal vat = new BigDecimal("0.23");
        BigDecimal priceWithVat = price.add(price.multiply(vat)).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Cena brutto z VAT: " + priceWithVat);
    }
}