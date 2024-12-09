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

        System.out.print("Podaj kwotę do podziału: ");
        String amountInput = scanner.nextLine();
        System.out.print("Podaj liczbę osób: ");
        int people = scanner.nextInt();

        BigDecimal amount = new BigDecimal(amountInput);
        BigDecimal peopleCount = new BigDecimal(people);

        BigDecimal perPerson = amount.divide(peopleCount, 2, RoundingMode.DOWN);
        BigDecimal remainder = amount.subtract(perPerson.multiply(peopleCount));

        System.out.println("Każda osoba otrzymuje: " + perPerson);
        System.out.println("Pozostała kwota: " + remainder);
    }
}
