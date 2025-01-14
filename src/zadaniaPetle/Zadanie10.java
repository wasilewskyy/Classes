package zadaniaPetle;

import java.util.Random;
import java.util.Scanner;

//Napisz program, który losuje liczbę od 1 do 100 i pozwala użytkownikowi ją odgadnąć.
// Po każdej próbie program podpowiada, czy liczba jest za duża, czy za mała. Użyj pętli while, instrukcji if i klasy Random.

public class Zadanie10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int liczbaDoZgadniecia = random.nextInt(100) + 1;
        System.out.println("Zgadnij liczbę z zakresu 1-100:");

        int proba;
        do {
            System.out.print("Podaj swoją odpowiedź: ");
            proba = scanner.nextInt();
            if (proba < liczbaDoZgadniecia) {
                System.out.println("Za mało!");
            } else if (proba > liczbaDoZgadniecia) {
                System.out.println("Za dużo!");
            } else {
                System.out.println("Gratulacje! Zgadłeś!");
            }
        } while (proba != liczbaDoZgadniecia);
    }
}
