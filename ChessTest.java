
public class ChessTest {
	public static void main(String[] args) {
		
		

		Chess myChess = new GraphicalChess(30, 31, true, 2,400,400);//it has the business logic of the chess
		//, it may not have graphical logic to show on the screen

		System.out.println("myChess : " + myChess);

		myChess.moveBishop();

	}
}

class Speaker {

}

class LoudSpeaker extends Speaker {
	int volumeLevel; 

	void decreaseVolume() {
		--volumeLevel;
	}
}

		//Knowledge -> applied -> Wisdom

		//The word/spelling "Water" is not the actual WATER  - 

		// experience of the WATER

class Chess { // Sumit is the developer of this class - 2 months time to develop
	private final int numberOfPlayers = 2; // fixed
	private final int numberOfSquares = 64; // fixed

	private int numberOfMovesByPlayer1;
	private int numberOfMovesByPlayer2;
	private boolean isCheckMate;
	private int winner;

//	public Chess(int numberOfPlayers, int numberOfSquares, int numberOfMovesByPlayer1, int numberOfMovesByPlayer2,
//			boolean isCheckMate, int winner) {
//		super();
//		//this.numberOfPlayers = numberOfPlayers;
//		//this.numberOfSquares = numberOfSquares;
//		this.numberOfMovesByPlayer1 = numberOfMovesByPlayer1;
//		this.numberOfMovesByPlayer2 = numberOfMovesByPlayer2;
//		this.isCheckMate = isCheckMate;
//		this.winner = winner;
//	}

	public Chess(int numberOfMovesByPlayer1, int numberOfMovesByPlayer2, boolean isCheckMate, int winner) {
		super();
		this.numberOfMovesByPlayer1 = numberOfMovesByPlayer1;
		this.numberOfMovesByPlayer2 = numberOfMovesByPlayer2;
		this.isCheckMate = isCheckMate;
		this.winner = winner;
	}

	
	@Override
	public String toString() {

		return "Chess [numberOfPlayers=" + numberOfPlayers + ", numberOfSquares=" + numberOfSquares
				+ ", numberOfMovesByPlayer1=" + numberOfMovesByPlayer1 + ", numberOfMovesByPlayer2="
				+ numberOfMovesByPlayer2 + ", isCheckMate=" + isCheckMate + ", winner=" + winner + "]";
	}
	
	/*
	 					      player1
1	 	 	Rook Knight Bishop King Queen Bishop Knight Rook
2	 	 	Pawn Pawn	Pawn   Pawn Pawn  Pawn   Pawn   Pawn <==white colors
3	 	 	
4
5
6	 	 	
7	 	 	Pawn Pawn	Pawn   Pawn Pawn  Pawn   Pawn   Pawn
8	 	 	Rook Knight Bishop King Queen Bishop Knight Rook <== black colors
	 	 					  player2
	 	 					  
	 	 					  
	 	 					  
	 	 	Ele  Horse  Camel ..   	 King		Vazeer				Pawn
	 	 	|	   |     |				|		 |					 |
	  vert/hori   L-Shape  diagonal  1step		vert/hori/diagonal	forward/diagonal		  
	  N-steps    one-step  N-steps	 anywhere	n-steps				1step	
	 bi-direct  bi-direct bi-direct			    bi-directional      unidirectional
	 */
	
	final void moveBishop() { //final version of the method, can never be overridden
		System.out.println("Math Moving...bishop diagonal way...N-steps...bi-directionally..");
		//math logic can be calculated here...
	}
	void moveKnight() { 
		System.out.println("Math Moving...Knight L-Shape way...1-step...bi-directionally..");
		//math logic can be calculated here...
	}
	void moveRook() { 
		System.out.println("Math Moving...Rook horizonal/vertical way...N-steps...bi-directionally..");
		//math logic can be calculated here...
	}
	void moveKing() { 
		System.out.println("Math Moving...King 1-steps...anywhere..");
		//math logic can be calculated here...
	}
	void moveQueen() { 
		System.out.println("Math Moving...Queen horizontal/vertical/diagonal way...N-steps...bi-directionally..");
		//math logic can be calculated here...
	}
	void movePawn() { 
		System.out.println("Math Moving...Pawn ahead/diagonal way...1-steps...uni-directionally..");
		//math logic can be calculated here...
	}
	

}

//this is the final version of the class, can never be extended

final class GraphicalChess extends Chess // developed by Gayatri
{
	int width;
	int height;
	
	
	public GraphicalChess(int numberOfMovesByPlayer1, int numberOfMovesByPlayer2, boolean isCheckMate, int winner,
			int width, int height) {
		super(numberOfMovesByPlayer1, numberOfMovesByPlayer2, isCheckMate, winner);
		this.width = width;
		this.height = height;
	}

	void moveGUIBishop() {  //real overriding - when u honor the code of the super class
			//plus you develop/extend/refine/polish your code too.....
		
		super.moveBishop();//borrow the math logic 
		System.out.println("Graphical Moving...bishop anywhere...N-steps...any-directionally..");
		//math logic can be calculated here...
	}
}

class GraphicalAnimatedChess extends GraphicalChess { //Vishhal
	
	int animationLevel; //2D 3D 4D 5D 9D
	
	public GraphicalAnimatedChess(int numberOfMovesByPlayer1, int numberOfMovesByPlayer2, boolean isCheckMate,
			int winner, int width, int height, int animationLevel) {
		super(numberOfMovesByPlayer1, numberOfMovesByPlayer2, isCheckMate, winner, width, height);
		this.animationLevel = animationLevel;
	}


	void moveGUIBishop() {  //real overriding - when u honor the code of the super class
		//plus you develop/extend/refine/polish your code too.....
	
		super.moveBishop();//borrow the math logic 
		System.out.println("Graphical Animated Moving...bishop L shape V Shape U Shape...N-steps...any-directionally..");
		//math logic can be calculated here...
	}
}





