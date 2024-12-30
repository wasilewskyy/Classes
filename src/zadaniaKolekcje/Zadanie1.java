package zadaniaKolekcje;

import java.util.ArrayList;
import java.util.List;

//Utwórz List<String> i dodaj do niej kilka łańcuchów znaków. Następnie wyświetl zawartość listy w pętli for-each.

public class Zadanie1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
