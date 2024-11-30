package zadaniaMetody;

//Napisz program, który pokazuje, że zmienne lokalne w różnych metodach są od siebie niezależne. Utwórz metodę testScope(int x),
// która zmienia wartość parametru x i wyświetla ją.
// W funkcji main zadeklaruj zmienną x, wywołaj metodę testScope, a następnie wyświetl wartość x w main.

public class Zadanie9 {
    public static void testScope(int x) {
        x = 10;
        System.out.println("Wartość x w testScope: " + x);
    }

    public static void main(String[] args) {
        int x = 5;
        testScope(x);
        System.out.println("Wartość x w main: " + x);
    }
}
