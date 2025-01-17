package zadaniaMetody;

//Napisz dwie metody o nazwie max, które przyjmują różne typy parametrów:
//
//max(int a, int b) – zwraca większą z dwóch liczb całkowitych.
//max(double a, double b) – zwraca większą z dwóch liczb rzeczywistych.
//Wywołaj obie metody w funkcji main i wyświetl wyniki.

public class Zadanie6 {

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Większa liczba całkowita to: " + max(12, 2));
        System.out.println("Większa liczba rzeczywista to: " + max(12.2, 2.5));
    }
}
