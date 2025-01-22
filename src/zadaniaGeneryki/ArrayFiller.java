package zadaniaGeneryki;

//Napisz metodę generyczną fillArray(GenericArray<? super Integer> array, Integer value), która ustawia każdy element w array na podaną wartość value.
//W main przygotuj GenericArray<Object> i wywołaj fillArray z wartością typu Integer.

public class ArrayFiller {
    public static void fillArray(GenericArray<? super Integer> array, Integer value) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        for (int i = 0; i < array.getSize(); i++) {
            array.set(i, value);
        }
    }
}
