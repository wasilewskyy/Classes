package zadaniaIf;

//Napisz program, który sprawdza, czy trójkąt o bokach a, b, c jest prostokątny, używając twierdzenia Pitagorasa.

public class Zadanie10 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        boolean isRightTriangle;

        if (a > b && a > c) {
            isRightTriangle = (b * b + c * c == a * a);
        } else if (b > a && b > c) {
            isRightTriangle = (a * a + c * c == b * b);
        } else {
            isRightTriangle = (a * a + b * b == c * c);
        }

        if (isRightTriangle) {
            System.out.println("Trójkąt o bokach " + a + ", " + b + ", " + c + " jest prostokątny.");
        } else {
            System.out.println("Trójkąt o bokach " + a + ", " + b + ", " + c + " nie jest prostokątny.");
        }
    }
}
