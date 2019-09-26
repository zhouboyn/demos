package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
    public static void main(String[] args) {
       //ExecutorService threadPool =  Executors.newFixedThreadPool(3);
        ExecutorService threadPool =  Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int task = i;
            //往线程池里扔任务
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        try {
                            Thread.sleep(20);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + " is looping of " + j + " for task of " + task);
                    }
                }
            });
        }
        System.out.println("all of 10 tasks have committed! ");

        Executors.newScheduledThreadPool(3).scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("bomb");
            }
        }, 3,2, TimeUnit.SECONDS);
    }
}
