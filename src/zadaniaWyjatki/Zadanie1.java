package zadaniaWyjatki;

//Napisz program, który pobiera od użytkownika liczbę całkowitą i oblicza jej pierwiastek kwadratowy.
// Jeśli użytkownik poda liczbę ujemną, program powinien rzucić IllegalArgumentException z komunikatem "Number cannot be negative".

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();

        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative.");
        }

        System.out.println("Pierwiastek kwadratowy: " + Math.sqrt(number));
    }
}