package zadaniaKolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Utwórz List<Integer> z losowymi liczbami i posortuj ją korzystając z Collections.sort(). Wyświetl listę przed i po sortowaniu.

public class Zadanie7 {
    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));
        System.out.println("Before sorting: " + randomNumbers);
        Collections.sort(randomNumbers);
        System.out.println("After sorting: " + randomNumbers);
    }
}
