package zadaniaGeneryki;

//Napisz statyczną metodę generyczną identity(T value), która przyjmuje dowolny obiekt typu T i zwraca go bez zmian.
//W metodzie main wywołaj identity z obiektem typu String i Integer i wyświetl wyniki.
//(Zadanie tylko pod sprawdzenie czy kod się kompiluje)

public class Identity {
    public static <T> T identity(T value) {
        return value;
    }
}
