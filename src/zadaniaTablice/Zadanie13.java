package zadaniaTablice;

import java.util.Arrays;

//Napisz program, który znajduje drugą co do wielkości wartość w tablicy liczb całkowitych.

public class Zadanie13 {
    public static void main(String[] args) {
        int[] tablica = {5, 2, 9, 1, 5, 6};

        Arrays.sort(tablica);

        int drugaNajwieksza = tablica[tablica.length - 2];
        System.out.println("Druga co do wielkości wartość: " + drugaNajwieksza);
    }
}