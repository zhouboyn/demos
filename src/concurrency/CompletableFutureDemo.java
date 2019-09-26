package concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-05-17
 **/
public class CompletableFutureDemo {
    public static void main(String[] args) {
        CompletableFuture<Void> f1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                System.out.println("洗水壶，烧开水。。");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                System.out.println("洗茶壶，洗茶杯，拿茶叶");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "龙井";
            }
        });
        CompletableFuture<String> f3 = f1.thenCombineAsync(f2, new BiFunction<Void, String, String>() {
            @Override
            public String apply(Void aVoid, String s) {
                System.out.println("拿到茶叶：" + s);
                System.out.println("泡中。。");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "成品" + s;
            }
        });

        System.out.println(f3.join());
    }
}
