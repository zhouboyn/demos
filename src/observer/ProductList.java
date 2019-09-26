package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductList extends Observable {
    //产品列表
    private List<String> productList = null;

    //类唯一实例
    private static ProductList instance;

    //构建方法私有化
    private ProductList() {}

    //创建单例
    public static ProductList getInstance() {
        if (instance == null) {
            instance = new ProductList();
            instance.productList = new ArrayList<>();
        }

        return instance;
    }

    /**
     * 增加观察者
     */
    public void addProductListObserver(Observer observer) {
        this.addObserver(observer);
    }


    /**
     * 新增产品
     */
    public void addProduct(String newProduct) {
        productList.add(newProduct);
        System.out.println("产品列表新增了产品：" + newProduct);
        //设置被观察对象发生变化，类似触发信号
        this.setChanged();
        //通知观察者，传递新产品，类似槽函数
        this.notifyObservers(newProduct);
    }
}
