package zadaniaGeneryki;

//Napisz metodę generyczną average(T[] array) z ograniczeniem T extends Number, która oblicza średnią wartość elementów w tablicy typu liczbowego.
//W main przetestuj ją z tablicą Integer[] oraz Double[].


//Napisz metodę generyczną sumArray(T[] array) z ograniczeniem T extends Number, która sumuje wszystkie elementy tablicy typu liczbowego i zwraca wynik jako double.
// W main przetestuj ją na tablicy Integer[] oraz Float[].

public class MathUtils {
    public static <T extends Number> double average(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        double sum = 0;
        for (T element : array) {
            sum += element.doubleValue();
        }
        return sum / array.length;
    }

    public static <T extends Number> double sumArray(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        double sum = 0;
        for (T element : array) {
            sum += element.doubleValue();
        }
        return sum;
    }
}
