package zadaniaAdnotacje.validated;

import zadaniaAdnotacje.validated.rules.EmailFormatRule;
import zadaniaAdnotacje.validated.rules.NotEmptyRule;

import java.util.ArrayList;
import java.util.List;

public class ValidationProcessor {

    private static List<ValidationRule> availableRules = new ArrayList<>();

    static {
        availableRules.add(new NotEmptyRule());
        availableRules.add(new EmailFormatRule());
    }

    /**
     * Waliduje obiekt, jeśli klasa obiektu jest oznaczona @Validated.
     */
    public static void validateObject(Object obj) throws ValidationException {
        Class<?> clazz = obj.getClass();
        // Sprawdzamy, czy jest adnotacja
        if (clazz.isAnnotationPresent(Validated.class)) {
            Validated anno = clazz.getAnnotation(Validated.class);
            String[] rules = anno.rules();

            for (String ruleName : rules) {
                // Szukamy w availableRules reguły o danej nazwie
                ValidationRule rule = findRuleByName(ruleName);
                if (rule != null) {
                    rule.validate(obj); // może rzucić ValidationException
                } else {
                    System.out.println("Brak zarejestrowanej reguły: " + ruleName);
                }
            }
        } else {
            System.out.println("Klasa " + clazz.getSimpleName() + " nie jest adnotowana @Validated");
        }
    }

    private static ValidationRule findRuleByName(String name) {
        for (ValidationRule rule : availableRules) {
            if (rule.getName().equals(name)) {
                return rule;
            }
        }
        return null;
    }
}
