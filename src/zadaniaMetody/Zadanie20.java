package zadaniaMetody;

import java.util.Scanner;

//Napisz następujące metody do analizy łańcucha znaków:
//
//int countVowels(String text) – zwraca liczbę samogłosek w podanym tekście.
//int countConsonants(String text) – zwraca liczbę spółgłosek w podanym tekście.
//String reverseString(String text) – zwraca odwrócony łańcuch znaków.
//boolean isPalindrome(String text) – sprawdza, czy podany tekst jest palindromem (ignorując wielkość liter i spacje).
//W funkcji main pobierz tekst od użytkownika, wywołaj powyższe metody i wyświetl wyniki.

public class Zadanie20 {

    public static int countVowels(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : text.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String text) {
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (char c : text.toCharArray()) {
            if (consonants.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }

    public static boolean isPalindrom(String text) {
        String cleanedText = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedText = reverseString(cleanedText);
        return cleanedText.equals(reversedText);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String text = scanner.nextLine();

        System.out.println("Liczba samogłosek: " + countVowels(text));
        System.out.println("Liczba spółgłosek: " + countConsonants(text));
        System.out.println("Odwrócony tekst: " + reverseString(text));
        System.out.println("Czy tekst jest palindromem? " + (isPalindrom(text) ? "Tak" : "Nie"));

    }
}
