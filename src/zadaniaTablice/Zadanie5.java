package zadaniaTablice;

import java.util.Scanner;

//Napisz program, który zlicza, ile razy dany element (podany przez użytkownika) występuje w tablicy liczb całkowitych.

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = {1, 2, 3, 2, 5, 2, 6, 7, 2, 8};

        System.out.print("Podaj liczbę do sprawdzenia: ");
        int liczba = scanner.nextInt();
        int licznik = 0;

        for (int element : tablica) {
            if (element == liczba) {
                licznik++;
            }
        }

        System.out.println("Liczba " + liczba + " występuje " + licznik + " razy.");
    }
}