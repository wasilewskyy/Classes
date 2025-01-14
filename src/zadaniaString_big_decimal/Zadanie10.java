package zadaniaString_big_decimal;

import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika łańcuch znaków text oraz słowo word.
//Zlicza, ile razy word występuje w text.
//Wyświetla wynik.

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String text = scanner.nextLine();
        System.out.print("Podaj słowo do zliczenia: ");
        String word = scanner.nextLine();

        int count = 0;
        String[] wordsInText = text.split("\\s+");
        for (String currentWord : wordsInText) {
            if (currentWord.equals(word)) {
                count++;
            }
        }
        System.out.println("Słowo \"" + word + "\" występuje " + count + " razy.");
    }
}
