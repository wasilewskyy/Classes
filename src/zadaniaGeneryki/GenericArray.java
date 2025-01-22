package zadaniaGeneryki;

//Utwórz klasę generyczną GenericArray<T>, która w konstruktorze przyjmuje rozmiar i tworzy wewnętrznie tablicę typu T[].
// Dodaj metody set(int index, T value) oraz T get(int index).
// W main utwórz GenericArray<Integer>, ustaw kilka elementów i wyświetl je.


//Rozszerz klasę GenericArray<T> o metodę copyFrom(GenericArray<? extends T> source), która kopiuje elementy z source do obiektu this (zakładając, że obie tablice mają ten sam rozmiar).
// W main przetestuj kopiowanie z GenericArray<Integer> do GenericArray<Number>.

public class GenericArray<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }

    public int getSize() {
        return array.length;
    }

    public void copyFrom(GenericArray<? extends T> source) {
        if (source == null) {
            throw new IllegalArgumentException("Source array cannot be null.");
        }

        if (source.getSize() != this.getSize()) {
            throw new IllegalArgumentException("Source array size must match the target array size.");
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = source.get(i);
        }
    }
}