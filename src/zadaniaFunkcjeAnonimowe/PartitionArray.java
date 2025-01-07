package zadaniaFunkcjeAnonimowe;

import java.util.function.*;

//Napisz metodę partitionArray(int[] array, Predicate<Integer> pred, Consumer<Integer> trueConsumer, Consumer<Integer> falseConsumer) która:
//
//Dla każdego elementu tablicy sprawdza pred.
//Jeśli true, wywołuje trueConsumer.accept(element), w przeciwnym razie falseConsumer.accept(element).
//W main przetestuj, np. dla liczb <10 wyświetl "Small:" i liczbę, a dla >=10 "Large:" i liczbę.

public class PartitionArray {
    public static void partitionArray(int[] array, Predicate<Integer> pred, Consumer<Integer> trueConsumer, Consumer<Integer> falseConsumer) {
        for (int element : array) {
            if (pred.test(element)) {
                trueConsumer.accept(element);
            } else {
                falseConsumer.accept(element);
            }
        }
    }
}