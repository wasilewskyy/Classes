package zadaniaTablice;

import java.util.Scanner;

//Napisz program, który tworzy tablicę 5 liczb rzeczywistych, pobiera wartości od użytkownika, a następnie oblicza i wyświetla sumę oraz średnią tych liczb.

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] tablica = new double[5];
        double suma = 0;

        System.out.println("Podaj 5 liczb:");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = scanner.nextDouble();
            suma += tablica[i];
        }

        double srednia = suma / tablica.length;
        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + srednia);
    }
}