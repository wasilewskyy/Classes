package zadaniaString_big_decimal;

import java.math.BigDecimal;

public class Validator {
    public static BigDecimal validateAndParseBigDecimal(String input) {
        try {
            return new BigDecimal(input);
        } catch (NumberFormatException e) {
            System.out.println("Podana wartość nie jest poprawną liczbą. Spróbuj ponownie.");
            return null;
        }
    }
}
