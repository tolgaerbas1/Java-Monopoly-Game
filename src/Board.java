
public class Board {
	
	private Square[] squareArray;
	
	protected Board() {
		squareArray = new Square[41];
		String name = "";
		for(int i=1;i<=40;i++) {
			name = "Square" + Integer.toString(i);
			squareArray[i] = new Square(i,name);
		}
	}
	
}
