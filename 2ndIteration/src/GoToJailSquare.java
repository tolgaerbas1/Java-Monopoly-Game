public class GoToJailSquare extends Square{

	protected GoToJailSquare(int squareLocation) {
		super(squareLocation);
		// TODO Auto-generated constructor stub
	}
	
	public void goToJail(Player p) {
		p.piece.setLocation(10);
		p.setJail(true);
	}		
}