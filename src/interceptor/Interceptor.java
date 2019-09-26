package interceptor;

import java.lang.reflect.Method;

/**
 * Created by zhoubo on 2018/6/1.
 */
public interface Interceptor {
    public boolean before(Object proxy, Object target, Method method, Object[] args);

    public void around(Object proxy, Object target, Method method, Object[] args);
    public void after(Object proxy, Object target, Method method, Object[] args);
}
