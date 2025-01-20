package zadaniaAdnotacje.AutoPrint;

import java.lang.reflect.Proxy;

class AutoPrintProxyFactory {
    public static <T> T createProxy(Class<T> interfaceType, T target) {
        return (T) Proxy.newProxyInstance(
                interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType},
                new AutoPrintInvocationHandler(target)
        );
    }
}
