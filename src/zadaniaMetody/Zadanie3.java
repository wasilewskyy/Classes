package zadaniaMetody;

//Napisz metodę sum(int a, int b), która przyjmuje dwie liczby całkowite i zwraca ich sumę. W funkcji main wywołaj tę metodę i wyświetl wynik.

public class Zadanie3 {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int wynik = sum(12, 10);
        System.out.println("Wynik dodawania dwóch liczb: " + wynik);
    }
}