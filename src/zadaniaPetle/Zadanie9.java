package zadaniaPetle;

import java.util.Scanner;

//Napisz program, który wyświetla wszystkie liczby Fibonacciego mniejsze niż n. Użyj pętli while i instrukcji if.

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Liczby Fibonacciego mniejsze niż " + n + ":");

        while (a < n) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
