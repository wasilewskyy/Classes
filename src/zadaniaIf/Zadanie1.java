package zadaniaIf;

import java.util.Scanner;

//Napisz program, który sprawdza, czy użytkownik jest pełnoletni na podstawie podanego wieku. Użyj prostego warunku if.

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();


        if (age >= 18) {
            System.out.println("You are an adult.");
        }
        if (age < 18) {
            System.out.println("You are not an adult.");

        }
    }
}