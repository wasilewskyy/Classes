package zadaniaMetody;

//Napisz metodę isSorted(int[] array), która przyjmuje tablicę liczb całkowitych i zwraca true, jeśli tablica jest posortowana rosnąco, lub false w przeciwnym razie.
// W funkcji main przetestuj tę metodę z różnymi tablicami i wyświetl wyniki.

public class Zadanie16 {
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] unsortedArray = {5, 3, 4, 1, 2};
        System.out.println("Tablica 1 posortowana: " + isSorted(sortedArray));
        System.out.println("Tablica 2 posortowana: " + isSorted(unsortedArray));
    }
}
