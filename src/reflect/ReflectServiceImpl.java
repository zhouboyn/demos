package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectServiceImpl {
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object object = null;
        ReflectServiceImpl reflectService = null;

        object =  Class.forName("reflect.ReflectServiceImpl").newInstance();

        if (object instanceof ReflectServiceImpl) {
            reflectService = (ReflectServiceImpl) object;
        }

        Method method = reflectService.getClass().getMethod("sayHello", String.class);

        method.invoke(reflectService, "bob");
    }
}
