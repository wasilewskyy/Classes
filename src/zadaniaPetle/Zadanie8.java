package zadaniaPetle;

import java.util.Scanner;

//Napisz program, który pozwala użytkownikowi wykonywać operacje matematyczne dopóki nie wybierze opcji wyjścia.
// Wykorzystaj pętlę do-while i instrukcję switch.

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean kontynuuj = true;

        do {
            System.out.println("Wybierz operację:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Wyjście");
            int wybor = scanner.nextInt();
            if (wybor == 5) {
                kontynuuj = false;
            } else {
                System.out.print("Podaj pierwszą liczbę: ");
                int a = scanner.nextInt();
                System.out.print("Podaj drugą liczbę: ");
                int b = scanner.nextInt();
                switch (wybor) {
                    case 1:
                        System.out.println("Wynik: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Wynik: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Wynik: " + a * b);
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Wynik: " + a / b);
                        } else {
                            System.out.println("Nie można dzielić przez zero");
                        }
                        break;
                    default:
                        System.out.println("Nieprawidłowy wybór");
                }
            }
        } while (kontynuuj);

        System.out.println("Koniec programu");
    }
}
