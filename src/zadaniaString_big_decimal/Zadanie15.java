package zadaniaString_big_decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika kwotę do podziału (jako String) oraz liczbę osób (int).
//Konwertuje kwotę na BigDecimal.
//Dzieli kwotę na równe części między osoby, zaokrąglając do dwóch miejsc po przecinku (użyj metody divide() z odpowiednim RoundingMode).
//Oblicza resztę, która pozostaje po podziale.
//Wyświetla, ile każda osoba powinna otrzymać oraz jaka kwota pozostaje niepodzielona.

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Podaj kwotę do podziału: ");
            String amountInput = scanner.nextLine();
            BigDecimal amount = validateAndParseBigDecimal(amountInput);

            System.out.print("Podaj liczbę osób: ");
            int people = validateAndParseInt(scanner.nextLine());

            if (people <= 0) {
                throw new IllegalArgumentException("Liczba osób musi być większa od zera.");
            }

            BigDecimal peopleCount = new BigDecimal(people);

            BigDecimal perPerson = amount.divide(peopleCount, 2, RoundingMode.DOWN);
            BigDecimal remainder = amount.subtract(perPerson.multiply(peopleCount));

            System.out.println("Każda osoba otrzymuje: " + perPerson);
            System.out.println("Pozostała kwota: " + remainder);

        } catch (NumberFormatException e) {
            System.out.println("Błąd: Podano niepoprawny format liczby.");
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Błąd: Próba dzielenia przez zero.");
        }
    }

    private static BigDecimal validateAndParseBigDecimal(String input) throws NumberFormatException {
        BigDecimal value = new BigDecimal(input);
        if (value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Kwota musi być większa od zera.");
        }
        return value;
    }

    private static int validateAndParseInt(String input) throws NumberFormatException {
        int value = Integer.parseInt(input);
        if (value <= 0) {
            throw new IllegalArgumentException("Liczba musi być większa od zera.");
        }
        return value;
    }
}
