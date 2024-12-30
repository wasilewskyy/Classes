package zadaniaGeneryki;

//Utwórz interfejs generyczny Transformer<S, R> z metodą R transform(S source).
// Następnie napisz klasę StringLengthTransformer implementującą Transformer<String, Integer>, której metoda transform zwraca długość przekazanego łańcucha.
// Napisz metodę generyczną transformArray(S[] source, Transformer<S,R> transformer, R[] destination), która wypełnia tablicę destination wynikami transformacji elementów z source.
// W main przetestuj ją na tablicy String[].

public class TransformerUtils {
    public static <S, R> void transformArray(S[] source, Transformer<S, R> transformer, R[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = transformer.transform(source[i]);
        }
    }
}
