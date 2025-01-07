package zadaniaFunkcjeAnonimowe;

import java.util.*;

//Napisz metodę flatMapToInt(Optional<String> opt), która:
//
//Jeśli wartość istnieje, próbuje sparsować ją do Integer używając flatMap i lambdy.
//Zwraca Optional<Integer> z wynikiem lub pusty Optional jeśli parse się nie uda.
//W main przetestuj dla "123", "abc" i pustego Optional.

public class FlatMapToInt {
    public static Optional<Integer> flatMapToInt(Optional<String> opt) {
        return opt.flatMap(s -> {
            try {
                return Optional.of(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                return Optional.empty();
            }
        });
    }
}
