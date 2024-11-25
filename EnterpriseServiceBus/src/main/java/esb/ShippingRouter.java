package esb;

public class ShippingRouter {
	public String route(Order order) {
        if(order.getOrderType().equals("International"))
            return "internationalshippingchannel";
        else{
            if (order.getAmount() > 175)
                return "nextdayshippingchannel";
            else
                return "normalshippingchannel";
        }
    }
}
