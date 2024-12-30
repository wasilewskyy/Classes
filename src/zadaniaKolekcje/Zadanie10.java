package zadaniaKolekcje;

import java.util.Arrays;
import java.util.LinkedList;

//Utwórz LinkedList<Integer> i dodaj kilkanaście liczb. Użyj metody subList() na List (którą LinkedList implementuje),
// aby wyświetlić fragment listy (np. elementy od indeksu 3 do 7).

public class Zadanie10 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Sublist (index 3 to 7): " + linkedList.subList(3, 7));
    }
}
