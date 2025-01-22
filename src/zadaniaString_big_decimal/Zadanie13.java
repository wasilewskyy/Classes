package zadaniaString_big_decimal;

import java.math.BigDecimal;

//Napisz program, który:
//
//Tworzy dwa obiekty BigDecimal o wartościach "0.1" i 0.1 (pierwszy jako String, drugi jako double).
//Porównuje je za pomocą metody equals() i wyświetla wynik.
//Porównuje je za pomocą metody compareTo() i wyświetla wynik.

public class Zadanie13 {
    public static void main(String[] args) {
        BigDecimal decimalFromString = new BigDecimal("0.1");
        BigDecimal decimalFromDouble = BigDecimal.valueOf(0.1);

        System.out.println("Porównanie za pomocą equals(): " + decimalFromString.equals(decimalFromDouble));
        System.out.println("Porównanie za pomocą compareTo(): " + decimalFromString.compareTo(decimalFromDouble));
    }
}

// Wnioski:
// 1. Metoda equals() w BigDecimal sprawdza również skalę liczby.
//decimalFromString ma skalę 1 (0.1), a decimalFromDouble ma skalę 17 (0.10000000000000001),
// dlatego equals() zwraca false.
//
// 2. Metoda compareTo() ignoruje skalę i porównuje wartości liczbowo.
// Dlatego compareTo() zwraca 0, co oznacza, że liczby są sobie równe pod względem wartości.