package zadaniaMetody;

//Napisz metodę factorial(int n), która przyjmuje liczbę całkowitą n i zwraca wartość n! (silnia z n).
// Użyj pętli do obliczenia silni. Wywołaj metodę w funkcji main i wyświetl wynik.

public class Zadanie5 {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Silnia z " + n + " wynosi " + factorial(n));
    }
}