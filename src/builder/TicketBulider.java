package builder;

public class TicketBulider {
    public static Object build(TicketHelper ticketHelper) {
        System.out.println("通过ticketHelper构建套票信息");
        return null;
    }

    public static void main(String[] args) {
        TicketHelper ticketHelper = new TicketHelper();
        ticketHelper.buildAdult("【全票】");
        ticketHelper.buildChildren("【1米2一下儿童免票】");
        ticketHelper.buildElderly("【80岁以上老人免费】");

        Object ticket = TicketBulider.build(ticketHelper);
    }
}
