package zadaniaTablice;

//Napisz program, który kopiuje jedną tablicę liczb całkowitych do drugiej w odwrotnej kolejności (odwraca kolejność elementów).

public class Zadanie8 {
    public static void main(String[] args) {
        int[] tablica = {1, 2, 3, 4, 5};
        int[] odwroconaTablica = new int[tablica.length];

        for (int i = 0; i < tablica.length; i++) {
            odwroconaTablica[i] = tablica[tablica.length - 1 - i];
        }

        System.out.println("Oryginalna tablica:");
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }

        System.out.println("\nOdwrócona tablica:");
        for (int liczba : odwroconaTablica) {
            System.out.print(liczba + " ");
        }
    }
}