package decorate;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-02-19
 **/
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new IPhone();
        p.call();

        System.out.println("-------------");

        PhoneDecorate pd = new RingPhoneDecorate(p);
        pd.call();

        System.out.println("-------------");

        pd = new MusicPhoneDecorate(p);
        pd.call();

        System.out.println("-------------");

        /**
         * 装饰者模式可以任意组合使用
         */
        pd = new RingPhoneDecorate(new MusicPhoneDecorate(p));
        pd.call();

    }
}
