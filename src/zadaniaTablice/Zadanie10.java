package zadaniaTablice;

import java.util.Scanner;

//Napisz program, który sprawdza, czy podany przez użytkownika łańcuch znaków jest palindromem, używając tablicy znaków.

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj łańcuch znaków: ");
        String tekst = scanner.nextLine();

        char[] znaki = tekst.toCharArray();
        boolean jestPalindromem = true;

        for (int i = 0; i < znaki.length / 2; i++) {
            if (znaki[i] != znaki[znaki.length - 1 - i]) {
                jestPalindromem = false;
                break;
            }
        }

        if (jestPalindromem) {
            System.out.println("Podany łańcuch jest palindromem.");
        } else {
            System.out.println("Podany łańcuch nie jest palindromem.");
        }
    }
}