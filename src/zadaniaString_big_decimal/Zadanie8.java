package zadaniaString_big_decimal;

import java.util.Scanner;

//Napisz program, który:
//
//Pobiera od użytkownika łańcuch znaków zawierający listę słów oddzielonych przecinkami, np. "jabłko,banan,gruszka".
//Rozbija łańcuch na tablicę słów (użyj metody split()).
//Wyświetla każde słowo w osobnej linii.

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj listę słów oddzielonych przecinkami: ");
        String input = scanner.nextLine();

        String[] words = input.split(",");
        System.out.println("Rozbite słowa:");
        for (String word : words) {
            System.out.println(word.trim());
        }
    }
}
