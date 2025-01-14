package zadaniaIf;

import java.util.Scanner;

//Napisz program, który sprawdza, czy podane hasło ma co najmniej 8 znaków. Użyj if do sprawdzenia długości łańcucha znaków.

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj hasło: ");
        String password = scanner.nextLine();

        if (password.length() >= 8) {
            System.out.println("Podane hasło jest prawidłowe.");
        } else if (password.length() < 8) {
            System.out.println("Hasło musi mieć co najmniej 8 znaków.");
        }
    }
}
