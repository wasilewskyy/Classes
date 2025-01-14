package zadaniaIf;

//Napisz program, który znajduje największą z trzech podanych liczb. Wykorzystaj zagnieżdżone if do porównania liczb.

public class Zadanie4 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        int najwieksza;

        if (a > b) {
            if (a > c) {
                najwieksza = a;
            } else {
                najwieksza = c;
            }
        } else {
            if (b > c) {
                najwieksza = b;
            } else {
                najwieksza = c;
            }
        }

        System.out.println("Największa liczba to: " + najwieksza);
    }
}
