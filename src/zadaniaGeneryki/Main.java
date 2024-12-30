package zadaniaGeneryki;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1
        String stringValue = Identity.identity("Hello");
        Integer intValue = Identity.identity(42);
        System.out.println("String value: " + stringValue);
        System.out.println("Integer value: " + intValue);

        // Zadanie 2
        Holder<String> stringHolder = new Holder<>();
        Holder<Integer> integerHolder = new Holder<>();
        stringHolder.setValue("World");
        integerHolder.setValue(99);
        System.out.println("Holder<String>: " + stringHolder.getValue());
        System.out.println("Holder<Integer>: " + integerHolder.getValue());

        // Zadanie 3
        String[] stringArray = {"A", "B", "C"};
        Integer[] integerArray = {1, 2, 3};
        ArrayUtils.printArray(stringArray);
        ArrayUtils.printArray(integerArray);

        // Zadanie 4
        GenericArray<Integer> genericArray = new GenericArray<>(5);
        genericArray.set(0, 10);
        genericArray.set(1, 20);
        genericArray.set(2, 30);
        System.out.println(genericArray.get(0));
        System.out.println(genericArray.get(1));
        System.out.println(genericArray.get(2));

        // Zadanie 5
        Double[] doubleArray = {1.5, 2.5, 3.5};
        System.out.println("Average: " + MathUtils.average(integerArray));
        System.out.println("Average: " + MathUtils.average(doubleArray));

        // Zadanie 6
        Float[] floatArray = {1.1f, 2.2f, 3.3f};
        System.out.println("Sum: " + MathUtils.sumArray(integerArray));
        System.out.println("Sum: " + MathUtils.sumArray(floatArray));

        // Zadanie 7
        String[] source = {"One", "Two", "Three"};
        Integer[] destination = new Integer[source.length];
        TransformerUtils.transformArray(source, new StringLengthTransformer(), destination);
        for (Integer length : destination) {
            System.out.println(length);
        }

        // Zadanie 8
        GenericArray<Integer> sourceArray = new GenericArray<>(3);
        sourceArray.set(0, 1);
        sourceArray.set(1, 2);
        sourceArray.set(2, 3);
        GenericArray<Number> targetArray = new GenericArray<>(3);
        targetArray.copyFrom(sourceArray);
        System.out.println(targetArray.get(0));
        System.out.println(targetArray.get(1));
        System.out.println(targetArray.get(2));

        // Zadanie 9
        GenericArray<Object> objectArray = new GenericArray<>(3);
        ArrayFiller.fillArray(objectArray, 42);
        System.out.println(objectArray.get(0));
        System.out.println(objectArray.get(1));
        System.out.println(objectArray.get(2));

        // Zadanie 10
        StringIntegerConverter converter = new StringIntegerConverter();
        System.out.println(converter.convertForward("123"));
        System.out.println(converter.convertBackward(456));
    }
}