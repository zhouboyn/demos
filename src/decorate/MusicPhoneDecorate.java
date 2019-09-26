package decorate;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-02-19
 **/
public class MusicPhoneDecorate extends PhoneDecorate {
    public MusicPhoneDecorate(Phone p) {
        super(p);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("手机可以听音乐了");
    }
}
