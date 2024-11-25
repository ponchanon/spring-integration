package esb;

public class Order {
	private String orderNumber;
	private double amount;
	private String orderType;

	public Order(String orderNumber, double amount, String orderType) {
		super();
		this.orderNumber = orderNumber;
		this.amount = amount;
		this.setOrderType(orderType);
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String toString(){
		return "order: nr="+orderNumber+" amount="+amount+" orderType="+orderType;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

}
