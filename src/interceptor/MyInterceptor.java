package interceptor;

import java.lang.reflect.Method;

/**
 * Created by zhoubo on 2018/6/1.
 */
public class MyInterceptor implements Interceptor{
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args){
        System.err.println("反射方法前");
        return false;//不反射被代理对象的原有方法
    }
    @Override
    public void around(Object proxy, Object target, Method method, Object[] args){
        System.err.println("取代了被代理对象的方法");
    }
    @Override
    public void after(Object proxy, Object target, Method method, Object[] args){
        System.err.println("反射方法后");
    }
}
