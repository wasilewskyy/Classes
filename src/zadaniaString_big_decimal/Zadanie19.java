package zadaniaString_big_decimal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika łańcuch znaków text.
//Znajduje i wyświetla słowo, które występuje najczęściej w text.
//Wyświetla liczbę wystąpień tego słowa.

public class Zadanie19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String text = scanner.nextLine().toLowerCase();

        String[] words = text.split("\\s+");
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        String mostFrequentWord = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Najczęściej występujące słowo: " + mostFrequentWord);
        System.out.println("Liczba wystąpień: " + maxCount);
    }
}
