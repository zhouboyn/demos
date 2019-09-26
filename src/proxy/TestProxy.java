package proxy; /**
 * Created by zhoubo on 2018/6/1.
 */

/**
 * 动态代理： 将实现类绑定在代理类上，返回代理对象（类型是实现类实现的接口），
 *            通过代理对象调用接口方法，可以实现在代理对象对逻辑的干涉，比如拦截住实现类的实现方法，不让执行，这样就实现了拦截器的逻辑
 */
public class TestProxy {

    public static void main(String[] args) {
        JdkProxyExample jdk = new JdkProxyExample();
        HelloWorld proxy = (HelloWorld)jdk.bind(new HelloWorldImpl());
        proxy.sayHelloWorld();
    }
}
