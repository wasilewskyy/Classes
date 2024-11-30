package zadaniaTablice;

//Napisz program, który w podanej tablicy liczb całkowitych znajduje najdłuższy ciąg kolejnych elementów o tej samej wartości (tzw. najdłuższy podciąg stały).
// Program powinien wyświetlić wartość tego elementu oraz długość najdłuższego ciągu.

public class Zadanie16 {
    public static void main(String[] args) {
        int[] tablica = {1, 2, 2, 2, 3, 4, 4, 2, 2};

        int aktualnaLiczba = tablica[0];
        int aktualnaDlugosc = 1;
        int maxLiczba = tablica[0];
        int maxDlugosc = 1;

        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] == aktualnaLiczba) {
                aktualnaDlugosc++;
            } else {
                aktualnaLiczba = tablica[i];
                aktualnaDlugosc = 1;
            }

            if (aktualnaDlugosc > maxDlugosc) {
                maxDlugosc = aktualnaDlugosc;
                maxLiczba = aktualnaLiczba;
            }
        }

        System.out.println("Wartość elementu: " + maxLiczba);
        System.out.println("Długość najdłuższego ciągu: " + maxDlugosc);
    }
}
