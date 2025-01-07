package zadaniaFunkcjeAnonimowe;

import java.util.function.BiFunction;

//Napisz metodę calculate(int a, int b, BiFunction<Integer, Integer, Integer> operation), która:
//
//Wykonuje operację zdefiniowaną w BiFunction na dwóch liczbach całkowitych.
//W main przetestuj z lambdami dodającymi, mnożącymi i odejmującymi.

public class Calculate {
    public static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> operation) {
        return operation.apply(a, b);
    }
}
