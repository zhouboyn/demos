package Enum;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-02-19
 **/
public class DirectionDemo {
    public static void main(String[] args) {
        Direction d = Direction.FRONT;
        System.out.println(d);
        d.show();

        System.out.println("---------------------");
        RealDirection rd = RealDirection.FRONT;
        System.out.println(rd);
        System.out.println(rd.getName());
        rd.show();

        RealDirection[] rds = RealDirection.values();
        for (RealDirection r: rds) {
            System.out.println(r);
        }
    }
}
