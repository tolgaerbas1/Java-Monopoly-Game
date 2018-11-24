public class GoSquare extends Square {
	Money goSquareMoney;
	protected GoSquare(int squareLocation) {
		super(squareLocation);
		goSquareMoney = new Money(200);
	}
	
	public void setMoney(Player p) {
		p.money.setMoney(goSquareMoney.getMoney());
	}
	
}