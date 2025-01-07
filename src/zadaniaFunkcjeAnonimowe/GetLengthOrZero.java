package zadaniaFunkcjeAnonimowe;

import java.util.*;

//Napisz metodę getLengthOrZero(Optional<String> opt), która:
//
//Jeśli opt ma wartość, zwraca długość tego łańcucha (użyj map i lambdy), w przeciwnym razie zwraca 0.
//W main przetestuj dla Optional.of("lambda") i Optional.empty().

public class GetLengthOrZero {
    public static int getLengthOrZero(Optional<String> opt) {
        return opt.map(String::length).orElse(0);
    }
}
