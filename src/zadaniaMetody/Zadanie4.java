package zadaniaMetody;

import java.util.Scanner;

//Napisz metodę isEven(int number), która przyjmuje liczbę całkowitą i zwraca true, jeśli jest parzysta, lub false w przeciwnym razie.
// W funkcji main pobierz liczbę od użytkownika, wywołaj metodę i wyświetl odpowiedni komunikat.

public class Zadanie4 {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();
        if (isEven(number)) {
            System.out.println("Podana liczba jest liczbą parzystą.");
        } else {
            System.out.println("Podana liczba nie jest liczbą parzystą.");
        }

    }
}
