package zadaniaMetody;

import java.util.Arrays;

//Napisz metodę transposeMatrix(int[][] matrix), która przyjmuje dwuwymiarową kwadratową tablicę liczb całkowitych i zwraca jej transponowaną wersję (zamienia wiersze z kolumnami).
// W funkcji main utwórz macierz, wywołaj metodę i wyświetl oryginalną oraz transponowaną macierz.

public class Zadanie18 {
    public static int[][] transposeMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] transposed = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Oryginalna macierz:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        int[][] transposed = transposeMatrix(matrix);
        System.out.println("Transponowana macierz:");
        for (int[] row : transposed) {
            System.out.println(Arrays.toString(row));
        }
    }
}