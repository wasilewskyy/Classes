package zadaniaTablice;

import java.util.Random;

//Napisz program, który oblicza sumę wszystkich elementów w dwuwymiarowej tablicy 3x3, zainicjalizowanej losowymi liczbami.

public class Zadanie12 {
    public static void main(String[] args) {
        int[][] macierz = new int[3][3];
        Random random = new Random();
        int suma = 0;

        System.out.println("Macierz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                macierz[i][j] = random.nextInt(10);
                suma += macierz[i][j];
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Suma elementów: " + suma);
    }
}