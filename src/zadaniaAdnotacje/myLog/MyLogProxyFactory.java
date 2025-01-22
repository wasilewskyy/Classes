package zadaniaAdnotacje.myLog;


import java.lang.reflect.Proxy;

public class MyLogProxyFactory {

    public static <T> T createProxy(Class<T> iface, T targetInstance) {
        return (T) Proxy.newProxyInstance(
                iface.getClassLoader(),
                new Class<?>[] { iface },
                new MyLogInvocationHandler(targetInstance)
        );
    }

}

