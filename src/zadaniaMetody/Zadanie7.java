package zadaniaMetody;

//Napisz metodę average(int[] numbers), która przyjmuje tablicę liczb całkowitych i zwraca ich średnią jako liczbę rzeczywistą.
// W funkcji main utwórz tablicę, wywołaj metodę i wyświetl wynik.

public class Zadanie7 {
    public static double average(int[] numbers) {
        if(numbers.length == 0) {
            System.out.println("Tablica jest pusta, nie można obliczyć średniej.");
            return 0;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Średnia: " + average(numbers));
    }
}
