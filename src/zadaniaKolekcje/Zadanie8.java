package zadaniaKolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Utwórz List<String> i dodaj kilka napisów. Użyj Collections.shuffle() aby je potasować. Wyświetl listę przed i po tasowaniu.

public class Zadanie8 {
    public static void main(String[] args) {
        List<String> shuffleList = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println("Before shuffling: " + shuffleList);
        Collections.shuffle(shuffleList);
        System.out.println("After shuffling: " + shuffleList);
    }
}
