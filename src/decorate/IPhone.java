package decorate;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-02-19
 **/
public class IPhone implements Phone {

    @Override
    public void call() {
        System.out.println("手机可以打电话");
    }
}
