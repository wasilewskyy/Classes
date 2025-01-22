package zadaniaAdnotacje.AutoPrint;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface AutoPrint {
    String label() default "";
    String mode() default "BOTH";
}
