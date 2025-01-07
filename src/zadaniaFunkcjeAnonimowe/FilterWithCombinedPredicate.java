package zadaniaFunkcjeAnonimowe;

import java.util.*;
import java.util.function.*;

//Napisz metodę filterWithCombinedPredicate(int[] array, Predicate<Integer> condition1, Predicate<Integer> condition2), która:
//
//Zwraca tablicę liczb spełniających oba warunki (condition1.and(condition2)).
//W main przetestuj na tablicy {1,10,15,25} szukając liczb >5 i <20.

public class FilterWithCombinedPredicate {
    public static int[] filterWithCombinedPredicate(int[] array, Predicate<Integer> condition1, Predicate<Integer> condition2) {
        return Arrays.stream(array).filter(condition1.and(condition2)::test).toArray();
    }
}
