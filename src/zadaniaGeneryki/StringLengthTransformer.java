package zadaniaGeneryki;

//Utwórz interfejs generyczny Transformer<S, R> z metodą R transform(S source).
// Następnie napisz klasę StringLengthTransformer implementującą Transformer<String, Integer>, której metoda transform zwraca długość przekazanego łańcucha.
// Napisz metodę generyczną transformArray(S[] source, Transformer<S,R> transformer, R[] destination), która wypełnia tablicę destination wynikami transformacji elementów z source.
// W main przetestuj ją na tablicy String[].

public class StringLengthTransformer implements Transformer<String, Integer> {
    @Override
    public Integer transform(String source) {
        return source.length();
    }
}
