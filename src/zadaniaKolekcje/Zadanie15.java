package zadaniaKolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Utwórz List<Integer> z powtarzającymi się wartościami.
// Użyj Collections.replaceAll() aby zamienić wszystkie wystąpienia danej wartości na inną.
// Wyświetl listę przed i po operacji, aby potwierdzić działanie metody.

public class Zadanie15 {
    public static void main(String[] args) {
        List<Integer> replaceList = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 2));
        System.out.println("Before replaceAll: " + replaceList);
        Collections.replaceAll(replaceList, 2, 99);
        System.out.println("After replaceAll: " + replaceList);
    }
}
