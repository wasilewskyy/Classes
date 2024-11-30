package zadaniaTablice;

import java.util.Scanner;

//Napisz program, który transponuje podaną macierz (zamienia wiersze z kolumnami).

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar macierzy (n x n): ");
        int n = scanner.nextInt();

        int[][] macierz = new int[n][n];
        System.out.println("Podaj elementy macierzy:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                macierz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Transponowana macierz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(macierz[j][i] + " ");
            }
            System.out.println();
        }
    }
}
