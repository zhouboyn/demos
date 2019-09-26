package aboutvolatile;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-02-22
 **/
public class Game {
    public static void main(String[] args) throws InterruptedException {
        GoalNotifier goalNotifier = new GoalNotifier();
        Thread thread = new Thread(goalNotifier);
        thread.start();


        Thread.sleep(3000);


        goalNotifier.setGoal(true);
    }
}
