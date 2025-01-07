package zadaniaFunkcjeAnonimowe;

import java.util.*;
import java.util.function.*;

//Napisz metodę filterAndTransform(int[] array, Predicate<Integer> predicate, Function<Integer, String> transformer), która:
//
//Filtruje elementy tablicy zgodnie z predicate.
//Przekształca wybrane elementy za pomocą transformer.
//Zwraca tablicę String[] z wynikami.
//W main przetestuj, filtrując liczby parzyste i zamieniając je na "Even: <liczba>".

public class FilterAndTransform {
    public static String[] filterAndTransform(int[] array, Predicate<Integer> predicate, Function<Integer, String> transformer) {
        List<String> results = new ArrayList<>();
        for (int number : array) {
            if (predicate.test(number)) {
                results.add(transformer.apply(number));
            }
        }
        return results.toArray(new String[0]);
    }
}
