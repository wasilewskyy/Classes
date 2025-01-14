package zadaniaString_big_decimal;

import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika łańcuch znaków str.
//Wyświetla pierwszy i ostatni znak tego łańcucha (użyj metody charAt()).
//Tworzy podłańcuch zawierający znaki od trzeciego do szóstego (użyj metody substring()).
//Wyświetla podłańcuch.

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj łańcuch znaków: ");
        String str = scanner.nextLine();

        if (str.isBlank()) {
            System.out.println("Błąd: Podany łańcuch znaków jest pusty.");
            return;
        }

        System.out.println("Pierwszy znak: " + str.charAt(0));
        System.out.println("Ostatni znak: " + str.charAt(str.length() - 1));

        if (str.length() >= 6) {
            String substring = str.substring(2, 6);
            System.out.println("Podłańcuch od trzeciego do szóstego znaku: " + substring);
        } else {
            System.out.println("Łańcuch jest za krótki do wycięcia podłańcucha.");
        }
    }
}