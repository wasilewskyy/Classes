package zadaniaKolekcje;

import java.util.HashMap;

//Utwórz HashMap<String, Integer> z danymi o liczbie produktów w magazynie (np. "Jabłka" -> 10, "Banany" -> 5).
// Wypisz ile jest "Banany" używając get(). Jeśli klucz nie istnieje, wypisz że nie ma takiego produktu.

public class Zadanie11 {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("Jabłka", 10);
        stock.put("Banany", 5);
        System.out.println("Banany: " + stock.getOrDefault("Banany", 0));
        System.out.println("Gruszki: " + stock.getOrDefault("Gruszki", 0));
    }
}
