package zadaniaAdnotacje;

import lombok.*;

@Setter
@EqualsAndHashCode
@ToString(exclude = {})
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "dodaj")
public class Person {
    private int age;
    private String name;
}
