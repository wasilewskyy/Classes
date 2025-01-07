package zadaniaFunkcjeAnonimowe;

import java.util.*;
import java.util.function.*;

//Napisz metodę countIf(int[] array, Predicate<Integer> predicate), która:
//
//Zlicza liczbę elementów w tablicy spełniających predicate.
//W main przetestuj licząc liczby >10 i liczby podzielne przez 3 w przykładowej tablicy.

public class CountIf {
    public static long countIf(int[] array, Predicate<Integer> predicate) {
        return Arrays.stream(array).filter(predicate::test).count();
    }
}
