public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		

		return cellId%8;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		
		return cellId/8;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);

		if(placedQueens[row][col]) {
			return false;
		}
		else {
			placedQueens[row][col] = true;
			for(int i= 0;i<8;i++) {
				placedQueens[row][i] = placedQueens[i][col] = true;
			}
			int i = row, j = col;
			while(i>=0 && j>=0)
			{
				placedQueens[i--][j--] = true;
			}
			i = row; j = col;
			while(i<=7 && j<=7)
			{
				placedQueens[i++][j++] = true;
			}
			for(i=0;i<8;i++)
				for(j=0;j<8;j++)
				{
					if(i+j == row+col)
						placedQueens[i][j] = true;
				}
			for(i=0;i<=7;i++){
				for(j=0;j<=7;j++)
					System.out.print(placedQueens[i][j] + " ");
				System.out.println();
			}
			return true;
		}
		/*
			WRITE YOUR LOGIC HERE...............................

		*/
	}
}














