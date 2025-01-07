package zadaniaFunkcjeAnonimowe;

import java.util.*;
import java.util.function.Consumer;

//Napisz metodę processIfPresent(Optional<String> optional, Consumer<String> action), która:
//
//Jeśli wartość w Optional istnieje, wywołuje action.accept() dla tej wartości.
//W main przetestuj metodę, przekazując lambdę wypisującą wartość na ekran.

public class ProcessIfPresent {
    public static void processIfPresent(Optional<String> optional, Consumer<String> action) {
        optional.ifPresent(action);
    }
}
