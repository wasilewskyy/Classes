package zadaniaWyjatki;

//Napisz metodę divide(int a, int b), która zwraca wynik dzielenia a przez b.
// Jeśli b jest zerem, metoda powinna rzucić ArithmeticException.
// Zadeklaruj ten wyjątek za pomocą słowa kluczowego throws. W metodzie main wywołaj tę metodę i obsłuż wyjątek.

public class Zadanie6 {
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Wynik: " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}