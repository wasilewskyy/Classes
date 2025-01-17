package zadaniaMetody;

import java.util.Scanner;

//Napisz rekurencyjną metodę fibonacci(int n), która zwraca n-ty wyraz ciągu Fibonacciego.
// W funkcji main pobierz od użytkownika liczbę n, wywołaj metodę i wyświetl wynik.

public class Zadanie10 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        int n = scanner.nextInt();
        System.out.println("n-ty wyraz ciągu Fibonacciego: " + fibonacci(n));
    }
}
