package zadaniaGeneryki;

//Utwórz klasę generyczną TwoWayConverter<A, B> z abstrakcyjnymi metodami B convertForward(A a) oraz A convertBackward(B b).
//Zaimplementuj klasę StringIntegerConverter rozszerzającą TwoWayConverter<String, Integer>:
//
//convertForward(String a) zamienia napis na liczbę całkowitą (np. "123" -> 123)
//convertBackward(Integer b) zamienia liczbę całkowitą na napis
//W main przetestuj oba kierunki konwersji.

public class StringIntegerConverter extends TwoWayConverter<String, Integer> {
    @Override
    public Integer convertForward(String a) {
        if (a == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input string must be a valid integer.", e);
        }
    }

    @Override
    public String convertBackward(Integer b) {
        if (b == null) {
            throw new IllegalArgumentException("Input integer cannot be null.");
        }
        return b.toString();
    }
}