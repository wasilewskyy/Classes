package zadaniaWyjatki;

//Napisz program, który pobiera od użytkownika dwa indeksy i zwraca sumę elementów tablicy o tych indeksach. Obsłuż dwa możliwe wyjątki:
//
//ArrayIndexOutOfBoundsException – jeśli któryś z indeksów jest poza zakresem tablicy.
//InputMismatchException – jeśli użytkownik wprowadził nieprawidłowe dane.
//W obu przypadkach wyświetl odpowiedni komunikat błędu.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};

        try {
            System.out.print("Podaj pierwszy indeks: ");
            int index1 = scanner.nextInt();
            System.out.print("Podaj drugi indeks: ");
            int index2 = scanner.nextInt();
            System.out.println("Suma: " + (array[index1] + array[index2]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indeks poza zakresem.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Nieprawidłowe dane wejściowe.");
        }
    }
}
