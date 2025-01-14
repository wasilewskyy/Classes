package zadaniaPetle;

//Napisz program, który oblicza sumę liczb od 1 do n, gdzie n jest podane przez użytkownika. Wykorzystaj pętlę for.

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i <= number; ++i) {
            suma += i;
        }

        System.out.println("Suma liczb od 1 do " + number + " wynosi: " + suma);
    }
}
