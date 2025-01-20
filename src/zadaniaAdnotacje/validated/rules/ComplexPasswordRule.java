package zadaniaAdnotacje.validated.rules;

import zadaniaAdnotacje.validated.ValidationException;
import zadaniaAdnotacje.validated.ValidationRule;

import java.util.regex.Pattern;

public class ComplexPasswordRule implements ValidationRule {

    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,}$";

    @Override
    public String getName() {
        return "ComplexPasswordRule";
    }

    @Override
    public void validate(Object obj) throws ValidationException {
        if (obj instanceof String) {
            validate("password", obj);
        } else {
            throw new ValidationException("Expected a String value for password field.");
        }
    }

    @Override
    public void validate(String fieldName, Object value) throws ValidationException {
        if (value instanceof String) {
            String password = (String) value;
            if (!Pattern.matches(PASSWORD_PATTERN, password)) {
                throw new ValidationException("Hasło nie spełnia wymogów złożoności!");
            }
        } else {
            throw new ValidationException("Pole " + fieldName + " musi być typu String.");
        }
    }
}
