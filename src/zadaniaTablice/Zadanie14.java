package zadaniaTablice;

import java.util.Scanner;

//Napisz program, który mnoży dwie macierze 2x2 i wyświetla wynik.

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] macierz1 = new int[2][2];
        int[][] macierz2 = new int[2][2];
        int[][] wynik = new int[2][2];

        System.out.println("Podaj elementy pierwszej macierzy 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                macierz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Podaj elementy drugiej macierzy 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                macierz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                wynik[i][j] = macierz1[i][0] * macierz2[0][j] + macierz1[i][1] * macierz2[1][j];
            }
        }

        System.out.println("Wynik mnożenia macierzy:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(wynik[i][j] + " ");
            }
            System.out.println();
        }
    }
}
