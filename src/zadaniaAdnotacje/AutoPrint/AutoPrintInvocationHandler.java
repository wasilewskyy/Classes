package zadaniaAdnotacje.AutoPrint;

import java.lang.reflect.*;

class AutoPrintInvocationHandler implements InvocationHandler {
    private final Object target;

    public AutoPrintInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        boolean isGetter = methodName.startsWith("get");
        boolean isSetter = methodName.startsWith("set");

        if (isGetter || isSetter) {
            String fieldName = methodName.substring(3);
            fieldName = Character.toLowerCase(fieldName.charAt(0)) + fieldName.substring(1);

            Field field = target.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);

            AutoPrint annotation = field.getAnnotation(AutoPrint.class);
            if (annotation != null) {
                String label = annotation.label();
                String mode = annotation.mode();

                if (isGetter && ("BOTH".equals(mode) || "GET".equals(mode))) {
                    Object value = field.get(target);
                    System.out.println(label + " " + value);
                } else if (isSetter && ("BOTH".equals(mode) || "SET".equals(mode))) {
                    Object newValue = args[0];
                    System.out.println(label + " " + newValue);
                }
            }
        }

        return method.invoke(target, args);
    }
}
