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