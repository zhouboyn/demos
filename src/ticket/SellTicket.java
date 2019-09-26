package ticket;

public class SellTicket implements Runnable{
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
           synchronized (this) {
               if (tickets > 0) {
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
               }
           }

        }
    }
}
