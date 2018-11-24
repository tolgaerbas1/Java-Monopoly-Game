public class Board {
	Square[] squareArray;
	
	protected Board() {
		squareArray = new Square[40];
		
		for(int i=0;i<40;i++) {
			if (i == 0) {
				squareArray[i] = new GoSquare(i); 
			}
			else if(i == 4) {
				squareArray[i] = new IncomeTaxSquare(i);
			}
			else if(i == 10) {
				squareArray[i] =  new JailSquare(i);
			}
			else if(i == 20) {
				squareArray[i] = new FreeParkingSquare(i);
			}
			else if(i == 30) {
				squareArray[i] = new GoToJailSquare(i);
			}
			else if(i == 38) {
				squareArray[i] = new LuxuryTaxSquare(i);
			}
			else {
				squareArray[i] = new EmptySquare(i);
			}
		}
			
	}
	
	
	
}