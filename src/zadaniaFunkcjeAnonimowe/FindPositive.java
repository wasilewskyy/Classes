package zadaniaFunkcjeAnonimowe;

import java.util.*;

//Napisz metodę findPositive(Optional<Integer> number), która:
//
//Sprawdza, czy wartość w Optional jest dodatnia (użyj filter i lambdy).
//Zwraca oryginalny Optional jeśli warunek jest spełniony, w przeciwnym wypadku Optional.empty().
//W main przetestuj dla Optional.of(5), Optional.of(-3) i Optional.empty().

public class FindPositive {
    public static Optional<Integer> findPositive(Optional<Integer> number) {
        return number.filter(n -> n > 0);
    }
}
