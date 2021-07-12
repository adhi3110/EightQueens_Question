public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		if((square/8)%2==0)
			return square%2==1;
		else
			return square%2==0;
	}
}
