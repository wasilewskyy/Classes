package zadaniaKolekcje;

import java.util.HashMap;

//Utwórz HashMap<String, Double> z informacjami o nazwach produktów i ich cenach.
// Użyj metody replace() aby zmienić cenę jednego z produktów, a następnie wyświetl mapę przed i po zmianie.

public class Zadanie13 {
    public static void main(String[] args) {
        HashMap<String, Double> productCosts = new HashMap<>();
        productCosts.put("Milk", 2.5);
        productCosts.put("Bread", 1.2);
        productCosts.put("Eggs", 3.0);
        System.out.println("Before replace: " + productCosts);
        productCosts.replace("Bread", 1.5);
        System.out.println("After replace: " + productCosts);
    }
}
