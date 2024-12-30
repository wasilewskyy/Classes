package zadaniaGeneryki;

//Napisz metodę generyczną printArray(T[] array), która wyświetla wszystkie elementy tablicy.
//W main przetestuj ją na tablicy String[] oraz Integer[].

public class ArrayUtils {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
