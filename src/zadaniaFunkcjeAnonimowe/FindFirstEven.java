package zadaniaFunkcjeAnonimowe;

import java.util.*;

//Napisz metodę findFirstEven(int[] numbers), która:
//
//Pobiera tablicę liczb całkowitych.
//Zwraca Optional<Integer> reprezentujący pierwszą liczbę parzystą w tablicy.
//W main wywołaj metodę dla {1,3,5,8,10} oraz dla pustej tablicy i wyświetl wynik (lub komunikat, że brak wartości).

public class FindFirstEven {
    public static Optional<Integer> findFirstEven(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .boxed()
                .findFirst();
    }
}