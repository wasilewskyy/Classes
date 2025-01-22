package zadaniaFunkcjeAnonimowe;

import java.util.*;
import java.util.function.*;

//Napisz metodę transformAndSum(int[] array, Function<Integer,Integer> transformer), która:
//
//Stosuje transformer do każdego elementu tablicy i sumuje wyniki.
//Zwraca sumę.
//W main przetestuj z lambdą podwajającą liczby i lambdą zwracającą kwadrat liczby.

public class TransformAndSum {
    public static int transformAndSum(int[] array, Function<Integer, Integer> transformer) {
        return Arrays.stream(array)
                .map(transformer::apply)
                .sum();
    }
}
