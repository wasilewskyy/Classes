package zadaniaIf;

import java.util.Scanner;

//Napisz program, który sprawdza, czy liczba jest parzysta, czy nieparzysta. Wykorzystaj if-else.

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Liczba jest parzysta.");
        } else {
            System.out.println("Liczba jest nieparzysta.");
        }

    }
}
