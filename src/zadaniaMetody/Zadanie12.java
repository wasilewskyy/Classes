package zadaniaMetody;

//Napisz metodę sumVarargs(int... numbers), która przyjmuje zmienną liczbę parametrów typu int i zwraca ich sumę.
// Wywołaj tę metodę w funkcji main z różną liczbą argumentów i wyświetl wyniki.

public class Zadanie12 {
    public static int sumVarargs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Suma 1: " + sumVarargs(1, 2, 3));
        System.out.println("Suma 2: " + sumVarargs(4, 5));
        System.out.println("Suma 3: " + sumVarargs(10));
    }
}
