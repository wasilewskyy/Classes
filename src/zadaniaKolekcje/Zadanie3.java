package zadaniaKolekcje;

import java.util.HashSet;
import java.util.Set;

//Utwórz Set<String> i dodaj do niego kilka powtarzających się napisów, np. "Apple", "Banana", "Apple", "Cherry".
//Wyświetl zawartość seta i sprawdź, że duplikaty nie występują.

public class Zadanie3 {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Apple");
        stringSet.add("Cherry");
        System.out.println("Set contents: " + stringSet);
    }
}
