package zadaniaWyjatki;

import java.util.Scanner;

//Napisz program, który przetwarza tablicę liczb całkowitych. Program powinien:
//
//Poprosić użytkownika o podanie indeksu elementu tablicy.
//W bloku try, wyświetlić wartość elementu o podanym indeksie.
//Wewnątrz tego bloku try, zagnieżdżony blok try powinien obliczyć odwrotność tej liczby (1 podzielone przez wartość elementu).
//Obsłuż ArrayIndexOutOfBoundsException, jeśli indeks jest poza zakresem.
//W zagnieżdżonym bloku try obsłuż ArithmeticException, jeśli wartość elementu to zero.

public class Zadanie10 {
    public static void main(String[] args) {
        int[] array = {10, 20, 0, 40};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj indeks: ");
        int index = scanner.nextInt();

        try {
            int value = array[index];
            System.out.println("Wartość: " + value);

            try {
                double inverse = 1.0 / value;
                System.out.println("Odwrotność: " + inverse);
            } catch (ArithmeticException e) {
                System.out.println("Error: Nie można dzielić przez zero.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indeks poza zakresem.");
        }
    }
}