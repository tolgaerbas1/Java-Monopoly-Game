public class IncomeTaxSquare extends Square {

	
	protected IncomeTaxSquare(int squareLocation) {
		super(squareLocation);
		// TODO Auto-generated constructor stub
	}
	
	public void setMoney(Player p) {
		p.money.setMoney(-p.money.getMoney() / 10 );
	}
}