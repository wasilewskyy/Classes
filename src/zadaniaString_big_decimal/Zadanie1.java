package zadaniaString_big_decimal;

import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika dwa łańcuchy znaków (String) i zapisuje je w zmiennych str1 i str2.
//Wyświetla długość obu łańcuchów (użyj metody length()).
//Sprawdza, czy oba łańcuchy są identyczne (użyj metody equals()).
//Łączy oba łańcuchy w jeden i wyświetla wynik.

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszy łańcuch znaków: ");
        String str1 = scanner.nextLine();
        System.out.print("Podaj drugi łańcuch znaków: ");
        String str2 = scanner.nextLine();

        System.out.println("Długość str1: " + str1.length());
        System.out.println("Długość str2: " + str2.length());
        System.out.println("Czy łańcuchy są identyczne? " + str1.equals(str2));
        System.out.println("Połączone łańcuchy: " + str1 + str2);
    }
}
