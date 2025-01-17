package zadaniaTablice;

//Napisz program, który tworzy tablicę 5 liczb całkowitych, inicjalizuje ją wartościami od 1 do 5, a następnie wyświetla zawartość tablicy.

public class Zadanie1 {
    public static void main(String[] args) {
        int[] tablica = {1, 2, 3, 4, 5};

        for (int liczba : tablica) {
            System.out.println(liczba);
        }
    }
}