package zadaniaIf;

import java.util.Scanner;

//Napisz program, który sprawdza, czy liczba jest dodatnia, ujemna, czy zero. Wykorzystaj if, else if, i else.

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Dodatnia");
        } else if (number < 0) {
            System.out.println("Ujemna");
        } else {
            System.out.println("Zero");
        }
    }
}
