package zadaniaMetody;

import java.util.Scanner;

//Napisz rekurencyjną metodę reverseString(String str), która przyjmuje łańcuch znaków i zwraca jego odwróconą wersję.
// W funkcji main pobierz łańcuch od użytkownika, wywołaj metodę i wyświetl wynik.

public class Zadanie17 {
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj łańcuch: ");
        String str = scanner.nextLine();
        System.out.println("Odwrócony łańcuch: " + reverseString(str));
    }
}