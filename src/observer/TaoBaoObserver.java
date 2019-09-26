package observer;

import java.util.Observable;
import java.util.Observer;

public class TaoBaoObserver implements Observer {
    @Override
    public void update(Observable o, Object product) {
        String newProduct = (String) product;
        System.out.println("发送新产品 【" + product + "】 同步到淘宝商城");
    }

    public static void main(String[] args) {
        ProductList observable = ProductList.getInstance();
        TaoBaoObserver taoBaoObserver = new TaoBaoObserver();

        observable.addObserver(taoBaoObserver);
        observable.addProduct("iphone X");
    }
}
