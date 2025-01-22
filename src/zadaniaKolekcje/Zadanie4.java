package zadaniaKolekcje;

import java.util.HashMap;
import java.util.Map;

//Utwórz Map<String, Integer> i dodaj do niej pary klucz-wartość odpowiadające np. produktom i ich cenom.
// Wyświetl wszystkie klucze, wszystkie wartości oraz każdą parę klucz-wartość (użyj entrySet()).

public class Zadanie4 {
    public static void main(String[] args) {
        Map<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Apple", 3);
        productPrices.put("Banana", 2);
        productPrices.put("Cherry", 5);
        System.out.println("Keys: " + productPrices.keySet());
        System.out.println("Values: " + productPrices.values());
        for (Map.Entry<String, Integer> entry : productPrices.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
