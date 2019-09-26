package readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-09-25
 **/
class Queue3 {
    private Object data = null;

    private ReadWriteLock rwl = new ReentrantReadWriteLock();

    public void get() {
        rwl.readLock().lock();;

        try {
            System.out.println(Thread.currentThread().getName() + " be ready to read data!");
            Thread.sleep((long)(Math.random()*1000));
            System.out.println(Thread.currentThread().getName() + "have read data :" + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rwl.readLock().unlock();
        }
    }

    public void put(Object data) {
        rwl.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " be ready to write data!");
            Thread.sleep((long)(Math.random()*1000));
            this.data = data;
            System.out.println(Thread.currentThread().getName() + "have write data :" + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rwl.writeLock().unlock();
        }
    }
}
