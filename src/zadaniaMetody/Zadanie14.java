package zadaniaMetody;

//Napisz dwie metody multiply(int a, int b) i multiply(int a). Pierwsza metoda zwraca iloczyn a * b, a druga zwraca a * 2.
// W funkcji main wywołaj obie metody i wyświetl wyniki.

public class Zadanie14 {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a) {
        return a * 2;
    }

    public static void main(String[] args) {
        System.out.println("Iloczyn (a, b): " + multiply(3, 4));
        System.out.println("Iloczyn (a): " + multiply(5));
    }
}
