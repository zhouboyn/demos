package concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-05-13
 **/

/**
 * 某个线程等其他几个线程执行完毕后，才可以执行，类似于计数器的用法
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {

        final CountDownLatch latch = new CountDownLatch(1);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " is working");
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "'s work has been done, latch set to 0");
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        try {
            System.out.println("waiting latch cut down to 0");
            latch.await();
            System.out.println("now I can do my business");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
