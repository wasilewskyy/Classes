package zadaniaWyjatki;

//Zdefiniuj własny wyjątek NegativeNumberException, który dziedziczy po Exception.
// Napisz metodę calculateSumToN(int n), która oblicza sumę liczb od 1 do n.
// Jeśli n jest ujemne, metoda powinna rzucić NegativeNumberException z komunikatem "Number cannot be negative".
// W metodzie main wywołaj tę metodę i obsłuż ewentualny wyjątek za pomocą try-catch.



public class Zadanie4 {
    public static int calculateSumToN(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Number cannot be negative");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        try {
            int sum = calculateSumToN(10);
            System.out.println("Suma: " + sum);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

