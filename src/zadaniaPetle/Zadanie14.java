package zadaniaPetle;

import java.util.Scanner;

//Napisz program, który dla podanego tekstu wyświetla liczbę liter, cyfr i innych znaków. Wykorzystaj pętlę for i instrukcję if do klasyfikacji znaków.

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();

        int litery = 0, cyfry = 0, inneZnaki = 0;

        for (char znak : tekst.toCharArray()) {
            if (Character.isLetter(znak)) {
                litery++;
            } else if (Character.isDigit(znak)) {
                cyfry++;
            } else {
                inneZnaki++;
            }
        }

        System.out.println("Liczba liter: " + litery);
        System.out.println("Liczba cyfr: " + cyfry);
        System.out.println("Liczba innych znaków: " + inneZnaki);
    }
}