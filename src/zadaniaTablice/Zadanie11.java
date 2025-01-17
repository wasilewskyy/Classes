package zadaniaTablice;

import java.util.Arrays;

//Napisz program, który sortuje tablicę liczb całkowitych rosnąco bez użycia wbudowanych metod sortowania (zaimplementuj sortowanie bąbelkowe).

public class Zadanie11 {
    public static void main(String[] args) {
        int[] tablica = {5, 2, 9, 1, 5, 6};

        for (int i = 0; i < tablica.length - 1; i++) {
            for (int j = 0; j < tablica.length - 1 - i; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    int temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                }
            }
        }

        System.out.println("Posortowana tablica: " + Arrays.toString(tablica));
    }
}