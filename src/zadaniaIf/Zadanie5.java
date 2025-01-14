package zadaniaIf;

import java.util.Scanner;

//Napisz program, który na podstawie punktów (0-100) przyznaje ocenę: 0-59 - "Niedostateczny",
// 60-69 - "Dostateczny", 70-79 - "Dobry", 80-89 - "Bardzo dobry", 90-100 - "Celujący".
// Wykorzystaj else if do zakresów wartości.

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj uzyskaną liczbę punktów: ");
        int punkty = scanner.nextInt();

        if (punkty <= 59) {
            System.out.println("Niedostateczny");
        } else if (punkty > 60 && punkty <= 69) {
            System.out.println("Dostateczny");
        } else if (punkty >= 70 && punkty <= 79) {
            System.out.println("Dobry");
        } else if (punkty >= 80 && punkty <= 89) {
            System.out.println("Bardzo dobry");
        } else if (punkty >= 90 && punkty <= 100) {
            System.out.println("Celujący");
        }
    }
}

