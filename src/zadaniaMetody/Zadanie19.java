package zadaniaMetody;

import java.util.Arrays;

//Napisz metodę insertionSort(int[] array), która sortuje przekazaną tablicę liczb całkowitych rosnąco, używając algorytmu sortowania przez wstawianie (insertion sort).
// Nie używaj wbudowanych metod sortujących.
// W funkcji main utwórz tablicę z nieposortowanymi liczbami, wywołaj metodę insertionSort, a następnie wyświetl posortowaną tablicę.

public class Zadanie19 {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 4, 1, 2};
        System.out.println("Przed sortowaniem: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Po sortowaniu: " + Arrays.toString(array));
    }
}
