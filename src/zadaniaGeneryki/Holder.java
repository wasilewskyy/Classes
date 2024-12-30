package zadaniaGeneryki;


//Utwórz klasę generyczną Holder<T> przechowującą pojedynczą wartość typu T.
// Dodaj metody setValue(T value) i getValue() do ustawiania i pobierania wartości.
// W main utwórz obiekt Holder<String> oraz Holder<Integer>, ustaw wartości i wyświetl je.

public class Holder<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
