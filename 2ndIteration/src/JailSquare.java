public class JailSquare extends Square{
	Money bail; 

	protected JailSquare(int squareLocation) {
		super(squareLocation);
		bail = new Money(50);
	}
	
	public void setMoney(Player p) {
		p.money.setMoney(-this.bail.getMoney());
	}

}