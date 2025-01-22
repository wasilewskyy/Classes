package zadaniaKolekcje;

import java.util.HashMap;

//Utwórz HashMap<String, Integer> z danymi o liczbie produktów w magazynie (np. "Jabłka" -> 10, "Banany" -> 5).
// Wypisz ile jest "Banany" używając get(). Jeśli klucz nie istnieje, wypisz że nie ma takiego produktu.

public class Zadanie11 {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("Jabłka", 10);
        stock.put("Banany", 5);

        String product1 = "Banany";
        if (stock.containsKey(product1)) {
            System.out.println(product1 + ": " + stock.get(product1));
        } else {
            System.out.println("Brak produktu: " + product1);
        }

        String product2 = "Gruszki";
        if (stock.containsKey(product2)) {
            System.out.println(product2 + ": " + stock.get(product2));
        } else {
            System.out.println("Brak produktu: " + product2);
        }
    }
}