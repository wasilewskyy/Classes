package zadaniaPetle;

import java.util.Scanner;

//Napisz program, który odwraca cyfrę podanej liczby całkowitej. Wykorzystaj pętlę while do odwracania liczby.

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();
        int odwrocona = 0;

        if (liczba == 0) {
            System.out.println("Liczba 0 po odwróceniu to nadal liczba 0.");
        } else {
            int zero = 0;
        }

        while (liczba != 0) {
            int cyfra = liczba % 10;
            odwrocona = odwrocona * 10 + cyfra;
            liczba /= 10;
        }

        System.out.println("Odwrócona liczba: " + odwrocona);
    }
}