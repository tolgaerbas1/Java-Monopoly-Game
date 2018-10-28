import java.util.Scanner;

public class MonopolyGame {
	
	static Board board;
	static Die die1;
	static Die die2;
	static Player[] player;
	static Money start_money;
	
	public static void main(String[] args) {
		
		//create game objects
		board = new Board();
		die1 = new Die();
		die2 = new Die();
		start_money = new Money(200);
		
		int iterations, players;
		Scanner scanner = new Scanner(System.in);
		
		// create players
		System.out.print("Enter the number of players(2-8): ");
		players = scanner.nextInt();
		
		while(players<2 || players >8) {
			System.out.print("\nPlease enter a valid number for players(2-8): ");
			players = scanner.nextInt();
		}
		
		player = new Player[players+1];
		for(int i=1; i<=players; i++)
			player[i] = new Player(i,start_money.getMoney());
		
		//Start the game
		System.out.print("\nEnter the number of iterations: ");
		iterations = scanner.nextInt();
		
		while(iterations<1) {
			System.out.print("\nPlease enter a valid number for iterations(>0): ");
			iterations = scanner.nextInt();
		}
		scanner.close();
		
		for(int j=1; j<=iterations; j++) {
			System.out.println("\n\t\tTour " + j);
			System.out.println("------------------------------------------------------------");
			
			for(int i=1; i<=players; i++) {
				System.out.println("\nPlayer" + player[i].getPlayerID() + " is in Square "+ player[i].getPiece().getLocation());
				
				//roll the dice
				die1.roll();
				die2.roll();
				System.out.println("Player"+player[i].getPlayerID() + " rolled " + die1.getFaceValue() + " , " + die2.getFaceValue() );
				
				//move the player's piece
				player[i].getPiece().setLocation(player[i].getPiece().getLocation() + die1.getFaceValue() + die2.getFaceValue());
				System.out.println("Player" + player[i].getPlayerID() + " is in Square "+ player[i].getPiece().getLocation());
				
				//if dice have equal face values
				int turncounter = 1;
				while(die1.getFaceValue()==die2.getFaceValue() && turncounter<3) {
					System.out.println("Player"+player[i].getPlayerID() + " rolled dice are equal,  rolling again" );
					die1.roll();
					die2.roll();
					System.out.println("Player"+player[i].getPlayerID() + " rolled " + die1.getFaceValue() + " , " + die2.getFaceValue() );
					
					player[i].getPiece().setLocation(player[i].getPiece().getLocation() + die1.getFaceValue() + die2.getFaceValue());
					
					System.out.println("Player" + player[i].getPlayerID() + " is in Square "+ player[i].getPiece().getLocation());
					turncounter++;
					if(turncounter == 3)
						System.out.println("Player"+player[i].getPlayerID() + " can't roll more than 3 times.Next players turn!");
				}
			}
		}
		
	}

}
