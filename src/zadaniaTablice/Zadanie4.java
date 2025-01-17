package zadaniaTablice;

import java.util.Scanner;

//Napisz program, który tworzy tablicę 10 liczb całkowitych, pobiera wartości od użytkownika, a następnie sprawdza, czy podana przez użytkownika liczba znajduje się w tablicy.

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];

        System.out.println("Podaj 10 liczb:");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = scanner.nextInt();
        }

        System.out.print("Podaj liczbę do sprawdzenia: ");
        int liczba = scanner.nextInt();
        boolean znaleziono = false;

        for (int element : tablica) {
            if (element == liczba) {
                znaleziono = true;
                break;
            }
        }

        if (znaleziono) {
            System.out.println("Liczba znajduje się w tablicy.");
        } else {
            System.out.println("Liczba nie znajduje się w tablicy.");
        }
    }
}