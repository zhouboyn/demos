package Enum;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-02-19
 **/
public abstract class Direction {
    //创建几个实例
    public static final Direction FRONT = new Direction("front") {
        @Override
        public void show() {
            System.out.println("front");
        }
    };
    public static final Direction BEHIND = new Direction("behind") {
        @Override
        public void show() {
            System.out.println("behind");
        }
    };
    public static final Direction LEFT = new Direction("left") {
        @Override
        public void show() {
            System.out.println("left");
        }
    };
    public static final Direction RIGHT = new Direction("right") {
        @Override
        public void show() {
            System.out.println("right");
        }
    };

    private String name;

    private Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void show();
}
