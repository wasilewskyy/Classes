package zadaniaWyjatki;

//Napisz metodę methodA(), która wywołuje methodB().
// Metoda methodB() rzuca wyjątek NullPointerException.
// W metodzie methodA() zadeklaruj ten wyjątek za pomocą throws, ale go nie obsługuj.
// W metodzie main wywołaj methodA() i obsłuż wyjątek.

public class Zadanie8 {
    public static void methodA() throws NullPointerException {
        methodB();
    }

    public static void methodB() throws NullPointerException {
        throw new NullPointerException("Null pointer exception occurred");
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
