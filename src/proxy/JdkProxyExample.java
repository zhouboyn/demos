package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhoubo on 2018/6/1.
 */
public class JdkProxyExample implements InvocationHandler{
    //真实对象
    private Object  target = null;
    //建立代理对象和真是对象的代理关系，返回代理对象
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("进入代理逻辑方法");
        System.out.println("before");
        Object obj = method.invoke(target, args);
        System.out.println("after");
        return obj;
    }

}
