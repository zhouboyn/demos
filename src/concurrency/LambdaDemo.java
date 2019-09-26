package concurrency;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-05-18
 **/
public class LambdaDemo {
    public static void main(String[] args) {
        new Thread(()-> System.out.println(Thread.currentThread().getName() + " say hello world")).start();
    }
}
