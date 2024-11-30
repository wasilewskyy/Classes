package zadaniaTablice;

//Napisz program, który dla podanej tablicy liczb całkowitych znajduje i wyświetla największą i najmniejszą wartość.

public class Zadanie6 {
    public static void main(String[] args) {
        int[] tablica = {12, 3, 45, 7, 34, 8, 2, 99};
        int min = tablica[0];
        int max = tablica[0];

        for (int liczba : tablica) {
            if (liczba < min) {
                min = liczba;
            }
            if (liczba > max) {
                max = liczba;
            }
        }

        System.out.println("Najmniejsza wartość: " + min);
        System.out.println("Największa wartość: " + max);
    }
}
