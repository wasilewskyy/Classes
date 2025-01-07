package zadaniaFunkcjeAnonimowe;

import java.util.function.Function;

//Napisz metodę applyFunctions(String input, Function<String, String> first, Function<String, String> second), która:
//
//Najpierw stosuje first do input.
//Następnie wynik przekazuje do second.
//W main przetestuj metodę z Function zmieniającą napis na wielkie litery i taką, która dodaje "!!!" na końcu.

public class ApplyFunctions {
    public static String applyFunctions(String input, Function<String, String> first, Function<String, String> second) {
        return first.andThen(second).apply(input);
    }
}
