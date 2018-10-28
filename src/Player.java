
public class Player {
	
	private Money money;
	private Piece piece;
	private int playerID;
	
	protected Player(int id, int money) {
		this.playerID = id;
		this.money = new Money(money);
		this.piece = new Piece();
	}
	
	public int getPlayerID() {
		return playerID;
	}
	
	public Money getMoney() {
		return this.money;
	}
	
	public Piece getPiece() {
		return this.piece;
	}
	
}
