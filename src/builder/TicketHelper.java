package builder;

public class TicketHelper {
    public void buildAdult(String info) {
        System.out.println("构建成年人逻辑"  + info);
    }

    public void buildChildren(String info) {
        System.out.println("构建儿童票逻辑" + info);
    }

    public void buildElderly(String info) {
        System.out.println("构建老年人票逻辑" + info);
    }
}
