package zadaniaKolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Utwórz List<String> z kilkoma napisami. Użyj Collections.frequency() aby sprawdzić, ile razy występuje w niej określony napis. Wyświetl wynik.

public class Zadanie9 {
    public static void main(String[] args) {
        List<String> frequencyList = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "A"));
        System.out.println("Frequency of 'A': " + Collections.frequency(frequencyList, "A"));
    }
}
