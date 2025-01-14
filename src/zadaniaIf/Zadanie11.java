package zadaniaIf;

import java.util.Scanner;

//Napisz program, który porównuje dwie liczby i wyświetla komunikat, która z nich jest większa lub czy są równe. Wykorzystaj if, else if, else.

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int number1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Pierwsza liczba jest większa.");
        } else if (number2 > number1) {
            System.out.println("Druga liczba jest większa");
        } else {
            System.out.println("Liczby są równe.");
        }
    }
}
