package decorate;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-02-19
 **/
public class RingPhoneDecorate extends PhoneDecorate {
    public RingPhoneDecorate(Phone p) {
        super(p);
    }

    @Override
    public void call() {
        System.out.println("手机可以听彩铃了");
        super.call();
    }
}
