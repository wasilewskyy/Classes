package zadaniaMetody;

//Napisz metodę divide(int a, int b), która zwraca wynik dzielenia a / b.
// Metoda powinna sprawdzać, czy b nie jest zerem.
// Jeśli jest, powinna wyświetlić komunikat o błędzie i zwrócić 0.
// W funkcji main przetestuj metodę z różnymi wartościami.

public class Zadanie15 {
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Błąd: Dzielenie przez zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Wynik 1: " + divide(10, 2));
        System.out.println("Wynik 2: " + divide(10, 0));
    }
}
