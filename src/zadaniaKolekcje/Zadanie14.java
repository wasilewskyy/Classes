package zadaniaKolekcje;

import java.util.Arrays;
import java.util.LinkedHashSet;

//Utwórz LinkedHashSet<String> i dodaj kilka napisów w określonej kolejności.
// Wyświetl je, aby zobaczyć, że LinkedHashSet zachowuje kolejność wstawiania elementów.
// Następnie usuń jeden z elementów i ponownie wyświetl zawartość.

public class Zadanie14 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("One", "Two", "Three", "Four"));
        System.out.println("LinkedHashSet: " + linkedHashSet);
        linkedHashSet.remove("Two");
        System.out.println("After removal: " + linkedHashSet);
    }
}
