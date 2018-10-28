
public class Money {
	
	private int money;
	private String type;
	
	protected Money(int money) {
		this.money = money;
		this.type = "$";
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public String getType() {
		return this.type;
	}
}
