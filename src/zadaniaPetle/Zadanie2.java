package zadaniaPetle;

//Napisz program, który oblicza sumę liczb od 1 do n, gdzie n jest podane przez użytkownika. Wykorzystaj pętlę for.

public class Zadanie2 {
    public static void main(String[] args) {
        int number = 20;
        int suma = 0;

        for (int i = 1; i <= number; ++i) {
            suma += i;
        }

        System.out.println("Suma liczb od 1 do " + number + " wynosi: " + suma);
    }
}
