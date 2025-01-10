package zadaniaPetle;

//Napisz program, który wyświetla wszystkie liczby parzyste od 1 do 20. Wykorzystaj pętlę for i instrukcję if do sprawdzenia parzystości.

public class Zadanie4 {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}