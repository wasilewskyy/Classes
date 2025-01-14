package zadaniaIf;

import java.util.Scanner;

//Napisz program, który na podstawie podanej temperatury wyświetla komunikat: poniżej 0 - "Mróz", 0-10 - "Zimno",
// 11-20 - "Chłodno", 21-30 - "Ciepło", powyżej 30 - "Gorąco". Wykorzystaj wiele else if do klasyfikacji.

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperature: ");
        int temperature = scanner.nextInt();

        if (temperature < 0) {
            System.out.println("Mróz");
        } else if (temperature >= 0 && temperature <= 10) {
            System.out.println("Zimno");
        } else if (temperature >= 11 && temperature <= 20) {
            System.out.println("Chłodno");
        } else if (temperature >= 21 && temperature <= 30) {
            System.out.println("Ciepło");
        } else if (temperature > 30) {
            System.out.println("Gorąco");
        }
    }
}