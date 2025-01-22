package zadaniaFunkcjeAnonimowe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        testZadanie1();
        testZadanie2();
        testZadanie3();
        testZadanie4();
        testZadanie5();
        testZadanie6();
        testZadanie7();
        testZadanie8();
        testZadanie9();
        testZadanie10();
        testZadanie11();
        testZadanie12();
        testZadanie13();
        testZadanie14();
        testZadanie15();
    }

    public static void testZadanie1() {
        int[] numbers1 = {1, 3, 5, 8, 10};
        int[] numbers2 = {};
        Optional<Integer> result1 = FindFirstEven.findFirstEven(numbers1);
        Optional<Integer> result2 = FindFirstEven.findFirstEven(numbers2);

        System.out.println(result1.map(n -> "Pierwsza liczba parzysta: " + n).orElse("Brak liczby parzystej"));
        System.out.println(result2.map(n -> "Pierwsza liczba parzysta: " + n).orElse("Brak liczby parzystej"));
    }

    public static void testZadanie2() {
        System.out.println(MapToUppercase.mapToUppercase(Optional.of("java")).orElse("Brak wartości"));
        System.out.println(MapToUppercase.mapToUppercase(Optional.empty()).orElse("Brak wartości"));
    }

    public static void testZadanie3() {
        System.out.println(FindPositive.findPositive(Optional.of(5)));
        System.out.println(FindPositive.findPositive(Optional.of(-3)));
        System.out.println(FindPositive.findPositive(Optional.empty()));
    }

    public static void testZadanie4() {
        ProcessIfPresent.processIfPresent(Optional.of("Hello"), System.out::println);
        ProcessIfPresent.processIfPresent(Optional.empty(), System.out::println);
    }

    public static void testZadanie5() {
        ApplyConsumerToArray.applyConsumerToArray(new String[]{"apple", "banana", "cherry"}, System.out::println);
    }

    public static void testZadanie6() {
        String[] transformed = FilterAndTransform.filterAndTransform(new int[]{1, 2, 3, 4, 5}, n -> n % 2 == 0, n -> "Even: " + n);
        System.out.println(Arrays.toString(transformed));
    }

    public static void testZadanie7() {
        int[] filtered = FilterWithCombinedPredicate.filterWithCombinedPredicate(new int[]{1, 10, 15, 25}, n -> n > 5, n -> n < 20);
        System.out.println(Arrays.toString(filtered));
    }

    public static void testZadanie8() {
        System.out.println(ApplyFunctions.applyFunctions("java", String::toUpperCase, s -> s + "!!!"));
    }

    public static void testZadanie9() {
        System.out.println(Calculate.calculate(5, 3, Integer::sum));
        System.out.println(Calculate.calculate(5, 3, (a, b) -> a * b));
        System.out.println(Calculate.calculate(5, 3, (a, b) -> a - b));
    }

    public static void testZadanie10() {
        System.out.println(CountIf.countIf(new int[]{1, 3, 10, 15, 30}, n -> n > 10));
        System.out.println(CountIf.countIf(new int[]{1, 3, 10, 15, 30}, n -> n % 3 == 0));
    }

    public static void testZadanie11() {
        System.out.println(GetLengthOrZero.getLengthOrZero(Optional.of("lambda")));
        System.out.println(GetLengthOrZero.getLengthOrZero(Optional.empty()));
    }

    public static void testZadanie12() {
        System.out.println(CombineOptionals.combineOptionals(Optional.of("Hello"), Optional.of("World"), (a, b) -> a + " " + b));
        System.out.println(CombineOptionals.combineOptionals(Optional.of("Hello"), Optional.empty(), (a, b) -> a + " " + b));
    }

    public static void testZadanie13() {
        System.out.println(FlatMapToInt.flatMapToInt(Optional.of("123")));
        System.out.println(FlatMapToInt.flatMapToInt(Optional.of("abc")));
        System.out.println(FlatMapToInt.flatMapToInt(Optional.empty()));
    }

    public static void testZadanie14() {
        System.out.println(TransformAndSum.transformAndSum(new int[]{1, 2, 3, 4}, n -> n * 2));
        System.out.println(TransformAndSum.transformAndSum(new int[]{1, 2, 3, 4}, n -> n * n));
    }

    public static void testZadanie15() {
        System.out.println("Przykład 1:");
        PartitionArray.partitionArray(new int[]{1, 10, 15, 5}, n -> n < 10,
                n -> System.out.println("Small: " + n),
                n -> System.out.println("Large: " + n));

        System.out.println("\nPrzykład 2:");
        PartitionArray.partitionArray(
                new int[]{1, -4, 6, 10, -2, 15, 8, -5},
                n -> n > 0,
                n -> {
                    if (n % 2 == 0) {
                        System.out.println("Positive Even: " + n);
                    } else {
                        System.out.println("Positive Odd: " + n);
                    }
                },
                n -> {
                    if (n < 0) {
                        System.out.println("Negative: " + n);
                    } else {
                        System.out.println("Large Positive: " + n);
                    }
                }
        );
    }
}
