package aop;

public interface Interceptor {
    public void before(Object object);
    public void after(Object object);
    public void afterReturning(Object object);
    public void afterThrowing(Object object);
}
