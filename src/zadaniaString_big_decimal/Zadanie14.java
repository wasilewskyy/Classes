package zadaniaString_big_decimal;

import java.math.BigDecimal;

//Napisz program, który:
//
//Oblicza sumę dziesięciu wartości 0.1 dodanych do siebie na trzy sposoby:
//Używając typu double.
//Używając BigDecimal, tworząc obiekty z typu double.
//Używając BigDecimal, tworząc obiekty z typu String.
//Wyświetla wyniki wszystkich trzech obliczeń.

public class Zadanie14 {
    public static void main(String[] args) {
        //Sposób 1
        double sumDouble = 0.0;
        for (int i = 0; i < 10; i++) {
            sumDouble += 0.1;
        }
        System.out.println("Suma przy użyciu double: " + sumDouble);

        //Sposób 2
        BigDecimal sumFromDouble = BigDecimal.ZERO;
        for (int i = 0; i < 10; i++) {
            sumFromDouble = sumFromDouble.add(BigDecimal.valueOf(0.1));
        }
        System.out.println("Suma przy użyciu BigDecimal (z double): " + sumFromDouble);

        //Sposób 3
        BigDecimal sumFromString = BigDecimal.ZERO;
        for (int i = 0; i < 10; i++) {
            sumFromString = sumFromString.add(new BigDecimal("0.1"));
        }
        System.out.println("Suma przy użyciu BigDecimal (z String): " + sumFromString);
    }
}

// Wnioski:
// 1. Użycie double (Sposób 1):
// Wynik sumy przy użyciu typu double wynosi 0.9999999999999999 zamiast 1.0.
// Wynika to z ograniczonej precyzji reprezentacji liczby zmiennoprzecinkowej w systemie binarnym.
//
// 2. BigDecimal z double (Sposób 2):
//Wynik jest precyzyjniejszy niż w przypadku double, ale nadal nie idealny (1.000000000000000055511151231).
//Wynika to z tego, że BigDecimal używa przekonwertowanej wartości `double`, która już zawiera błąd precyzji.
//
// 3. BigDecimal z String (Sposób 3):
//Wynik jest dokładny (1.0), ponieważ w tym przypadku BigDecimal bezpośrednio operuje na wartości
//tekstowej, co pozwala uniknąć błędów precyzji związanych z konwersją.