package zadaniaFunkcjeAnonimowe;

import java.util.*;

//Napisz metodę mapToUppercase(Optional<String> optional), która:
//
//Jeśli wartość jest w Optional, zamienia ją na wielkie litery (używając map i lambdy).
//Zwraca nowy Optional<String>.
//W main przetestuj metodę dla Optional.of("java") oraz Optional.empty().

public class MapToUppercase {
    public static Optional<String> mapToUppercase(Optional<String> optional) {
        return optional.map(String::toUpperCase);
    }
}
