package zadaniaKolekcje;

import java.util.ArrayList;
import java.util.List;

//Utwórz List<Integer> i dodaj liczby od 1 do 5. Następnie pobierz i wyświetl element na indeksie 2.
// Usuń element o wartości 3 i wyświetl listę ponownie, aby sprawdzić czy został usunięty.

public class Zadanie2 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        System.out.println("Element at index 2: " + integerList.get(2));
        integerList.remove(Integer.valueOf(3));
        System.out.println("List after removing 3: " + integerList);
    }
}
