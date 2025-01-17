package zadaniaMetody;

//Napisz metodę printArray(int[] array), która wypisuje elementy tablicy liczb całkowitych na ekranie, oddzielone przecinkami.
// Wywołaj tę metodę w funkcji main.

public class Zadanie8 {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(array);
    }
}
