package zadaniaPetle;

//Napisz program, który wyświetla tabliczkę mnożenia dla liczby podanej przez użytkownika. Wykorzystaj pętlę for.

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; ++i) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}