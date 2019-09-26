package ticket;

/**
 * 如何解决线程安全问题？
 * 先判断出问题的条件
 *  1. 是否是多线程环境
 *  2. 是否有共享数据
 *  3. 是否有多条语句操作共享数据
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        //创建资源对象
        SellTicket st = new SellTicket();

        //创建三个线程对象
        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
