
public class ChessTest {
	public static void main(String[] args) {

		Chess myChess = new Chess(30, 31, true, 2);

		System.out.println("myChess : " + myChess);



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

class Chess {
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

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	
	public int getNumberOfSquares() {
		return numberOfSquares;
	}


	public int getNumberOfMovesByPlayer1() {
		return numberOfMovesByPlayer1;
	}

	public void setNumberOfMovesByPlayer1(int numberOfMovesByPlayer1) {
		this.numberOfMovesByPlayer1 = numberOfMovesByPlayer1;
	}

	public int getNumberOfMovesByPlayer2() {
		return numberOfMovesByPlayer2;
	}

	public void setNumberOfMovesByPlayer2(int numberOfMovesByPlayer2) {
		this.numberOfMovesByPlayer2 = numberOfMovesByPlayer2;
	}

	public boolean isCheckMate() {
		return isCheckMate;
	}

	public void setCheckMate(boolean isCheckMate) {
		this.isCheckMate = isCheckMate;
	}

	public int getWinner() {
		return winner;
	}

	public void setWinner(int winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {

		return "Chess [numberOfPlayers=" + numberOfPlayers + ", numberOfSquares=" + numberOfSquares
				+ ", numberOfMovesByPlayer1=" + numberOfMovesByPlayer1 + ", numberOfMovesByPlayer2="
				+ numberOfMovesByPlayer2 + ", isCheckMate=" + isCheckMate + ", winner=" + winner + "]";
	}

}
