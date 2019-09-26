package interceptor;

/**
 * Created by zhoubo on 2018/8/6.
 */
public class TestInterceptor {

        public static void main(String[] args) {

            HelloWorld proxy = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(), "MyInterceptor");
            proxy.sayHelloWorld();
        }

}
