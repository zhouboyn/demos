package decorate; /**
 * @desc:
 * @author: zhoubo
 * @date: 2019-02-19
 **/

/**
 * 这是抽象类，不能被实例化，由子类来实例化
 */
public abstract class PhoneDecorate implements Phone{
    private Phone p;
    public PhoneDecorate(Phone p) {
        this.p = p;
    }

    @Override
    public void call() {
        this.p.call();
    }
}
