package zadaniaWyjatki;

//Dodaj do programu z Zadania 2 blok finally w funkcji calculateSquareRoot(int number),
// który wyświetli komunikat "Calculation completed". Upewnij się, że komunikat ten wyświetla się niezależnie od tego, czy wyjątek wystąpił, czy nie.

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();
        double result = calculateSquareRoot(number);
        System.out.println("Wynik: " + result);
    }

    public static double calculateSquareRoot(int number) {
        try {
            if (number < 0) {
                throw new IllegalArgumentException("Number cannot be negative");
            }
            return Math.sqrt(number);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        } finally {
            System.out.println("Calculation completed");
        }
    }
}