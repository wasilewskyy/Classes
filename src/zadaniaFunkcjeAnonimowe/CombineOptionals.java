package zadaniaFunkcjeAnonimowe;

import java.util.*;
import java.util.function.*;

//Napisz metodę combineOptionals(Optional<String> opt1, Optional<String> opt2, BiFunction<String,String,String> combiner), która:
//
//Jeśli obie wartości istnieją, łączy je używając combiner.
//Jeśli którejś brakuje, zwraca Optional.empty().
//W main przetestuj, łącząc dwie nazwy np. "Hello" i "World".

public class CombineOptionals {
    public static Optional<String> combineOptionals(Optional<String> opt1, Optional<String> opt2, BiFunction<String, String, String> combiner) {
        return opt1.flatMap(a -> opt2.map(b -> combiner.apply(a, b)));
    }
}
