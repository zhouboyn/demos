package aboutvolatile;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-02-22
 **/
public class GoalNotifier implements Runnable
{
    /**
     * 此处有volatile代码才会正常执行
     */
    public  boolean goal = false;

    public boolean isGoal() {
        return goal;
    }

    public void setGoal(boolean goal) {
        this.goal = goal;
    }

    @Override
    public void run() {
        while (true) {
            if (isGoal()) {
                System.out.println("goal!!!!");
                setGoal(false);
            }
        }
    }
}
