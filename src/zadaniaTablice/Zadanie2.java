package zadaniaTablice;

//Napisz program, który tworzy tablicę 10 liczb całkowitych, inicjalizuje ją tak,
// że każdy element jest równy dwukrotności jego indeksu (tj. element o indeksie i ma wartość 2*i), a następnie wyświetla zawartość tablicy.

public class Zadanie2 {
    public static void main(String[] args) {
        int[] tablica = new int[10];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = 2 * i;
        }

        for (int liczba : tablica) {
            System.out.println(liczba);
        }
    }
}