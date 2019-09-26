package readwritelock;

import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-02-25
 **/
public class ReadWriteLockTest {
    public static void main(String[] args) {
        final Queue3 q3 = new Queue3();
        for (int i = 0; i < 3; i++) {
            new Thread(){
                @Override
                public void run() {
                    while (true) {
                        q3.get();
                    }
                }
            }.start();

            new Thread(){
                @Override
                public void run() {
                    while (true) {
                        q3.put(new Random().nextInt(10000));
                    }
                }
            }.start();
        }
    }
}

