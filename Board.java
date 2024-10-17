public class Board{

	static int [][] board = new int [21][21];
	static int [][] spaces = new int [21][21];

	public static int[][] getBoard(){

		return board;
	}
	
	public static  void setBoard( int [][] currentBoard){

		board = currentBoard;
	}

	public static void displayBoard(){

		for(int count = 0; count < board.length ; count++){

			board[0][count] = 8;
			board[count][0] = 8;
			board[20][count] = 8;
			board[count][20] = 8;	
		}	

		int currentRow = Turtle.getRow();
		int currentColumn = Turtle.getColumn();

		board[currentRow][currentColumn] = 1;
		spaces = getBoard();

		for(int count = 0; count < board.length; count ++){

			for(int counter = 0; counter< board[count].length; counter++){

				if(board[count][counter]==0)System.out.print("  ");					if(board[count][counter]==1)System.out.print("* ");
				if(board[count][counter]==8)System.out.print("o ");
			}

			System.out.println();
		}

		if(Pen.isPenClicked()==false)board[currentRow][currentColumn] = 0;

		board = spaces;

	}


}