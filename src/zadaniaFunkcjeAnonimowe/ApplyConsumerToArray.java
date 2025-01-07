package zadaniaFunkcjeAnonimowe;

import java.util.function.Consumer;

//Napisz metodę applyConsumerToArray(String[] array, Consumer<String> consumer), która:
//
//Wywołuje consumer.accept(element) dla każdego elementu tablicy.
//W main użyj jej do wyświetlenia wszystkich elementów {"apple", "banana", "cherry"}.

public class ApplyConsumerToArray {
    public static void applyConsumerToArray(String[] array, Consumer<String> consumer) {
        for (String element : array) {
            consumer.accept(element);
        }
    }
}
