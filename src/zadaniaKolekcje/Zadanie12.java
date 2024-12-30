package zadaniaKolekcje;

import java.util.Arrays;
import java.util.TreeSet;

//Utwórz TreeSet<String> i dodaj do niego różne napisy.
// Wyświetl jego zawartość, sprawdź jak jest posortowana.
// Następnie użyj metod takich jak first(), last() aby wyświetlić pierwszy i ostatni element w porządku sortowania.

public class Zadanie12 {
    public static void main(String[] args) {

        TreeSet<String> sortedSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        sortedSet.addAll(Arrays.asList("Orange", "Apple", "Banana", "Cherry"));
        System.out.println("Sorted Set: " + sortedSet);
        System.out.println("First: " + sortedSet.first());
        System.out.println("Last: " + sortedSet.last());

    }
}
