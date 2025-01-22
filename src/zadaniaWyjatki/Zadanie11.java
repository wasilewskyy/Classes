package zadaniaWyjatki;

//Napisz metodę rekurencyjną fibonacci(int n), która zwraca n-ty wyraz ciągu Fibonacciego.
// Jeśli n jest mniejsze niż 0, metoda powinna rzucić IllegalArgumentException.
// Nie obsługuj wyjątku w tej metodzie; pozwól, aby został przekazany do miejsca wywołania.
// W metodzie main wywołaj fibonacci() i obsłuż ewentualny wyjątek.

public class Zadanie11 {
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        try {
            System.out.println(fibonacci(-5));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}