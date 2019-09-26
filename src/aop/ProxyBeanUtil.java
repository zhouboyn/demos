package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBeanUtil implements InvocationHandler {

    //被代理对象
    private Object obj;

    //拦截器
    private Interceptor interceptor;

    /**
     * 返回动态代理对象
     * @Param obj 被代理对象
     * @param interceptor 拦截器
     * @return 动态代理对象
     */
    public static Object getBean(Object obj, Interceptor interceptor) {
        ProxyBeanUtil proxyBeanUtil = new ProxyBeanUtil();
        proxyBeanUtil.obj = obj;
        proxyBeanUtil.interceptor = interceptor;

        //生成代理对象，并绑定代理方法, 返回接口类型
        /**
         * 参数proxyBeanUtil的意思应该是，用这个对象的invoke方法完成对接口方法的调用
         */
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), proxyBeanUtil);
    }


    /**
     * 代理方法
     * @param proxy 代理对象
     * @param method 当前调度方法
     * @param args 参数
     */
    @Override
    public Object invoke(Object proxy1, Method method, Object[] args) throws Throwable {
        Object retObj = null;

        //是否产生异常
        boolean exceptionFlag = false;

        //before 方法
        interceptor.before(obj);

        try {
            //反射原有方法
            retObj = method.invoke(obj, args);
        }catch (Exception e) {
            exceptionFlag = true;
        } finally {
            //after 方法
            interceptor.after(obj);
        }

        if (exceptionFlag) {
            interceptor.afterThrowing(obj);
        } else {
            interceptor.afterReturning(obj);
        }

        return retObj;
    }

}
