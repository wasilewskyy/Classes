package zadaniaWyjatki;

//Zmodyfikuj program z Zadania 1 tak, aby przenieść logikę obliczeń do osobnej funkcji calculateSquareRoot(int number).
// Wewnątrz tej funkcji obsłuż wyjątek IllegalArgumentException za pomocą bloku try-catch.
// W przypadku wystąpienia wyjątku, zwróć wartość -1 i wyświetl komunikat "Error: Number cannot be negative".

import java.util.Scanner;

public class Zadanie2 {
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
                    throw new IllegalArgumentException("Number cannot be negative.");
            }
            return Math.sqrt(number);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }
}
