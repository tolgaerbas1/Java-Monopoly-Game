
public class Square {
	
	private int squareLocation;
	private String name;
	
	protected Square(int location, String name) {
		this.squareLocation = location;
		this.name = name;
	}
	
	public int getSquareLocation() {
		return this.squareLocation;
	}
	
	public String getName() {
		return this.name;
	}
}
