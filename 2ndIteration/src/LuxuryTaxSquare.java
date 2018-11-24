public class LuxuryTaxSquare extends Square {
	Money luxuryTax;
	protected LuxuryTaxSquare(int squareLocation) {
		super(squareLocation);
		luxuryTax = new Money(75);
	}
	
	public void setMoney(Player p) {
		p.money.setMoney(-luxuryTax.getMoney());
	}
}