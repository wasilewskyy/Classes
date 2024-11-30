package zadaniaTablice;

import java.util.Scanner;

//Napisz program, który tworzy dwie tablice liczb całkowitych o tej samej długości, pobiera wartości od użytkownika,
// a następnie tworzy trzecią tablicę, która jest sumą odpowiednich elementów pierwszych dwóch tablic.

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica1 = new int[5];
        int[] tablica2 = new int[5];
        int[] sumaTablic = new int[5];

        System.out.println("Podaj 5 liczb do pierwszej tablicy:");
        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = scanner.nextInt();
        }

        System.out.println("Podaj 5 liczb do drugiej tablicy:");
        for (int i = 0; i < tablica2.length; i++) {
            tablica2[i] = scanner.nextInt();
        }

        for (int i = 0; i < sumaTablic.length; i++) {
            sumaTablic[i] = tablica1[i] + tablica2[i];
        }

        System.out.println("Suma tablic:");
        for (int liczba : sumaTablic) {
            System.out.println(liczba);
        }
    }
}