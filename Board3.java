public class Board3{

	private int [][] board = new int [21][21];
	private int [][] spaces = new int [21][21];

	public  int[][] getBoard(){

		return this.board;
	}
	
	public  void setBoard( int [][] currentBoard){

		this.board = currentBoard;
	}

	public void displayBoard(){

		Turtle turtle = new Turtle();
		Pen pen = new Pen();

		int [][] board = getBoard();

		for(int count = 0; count < board.length ; count++){

			board[0][count] = 8;
			board[count][0] = 8;
			board[20][count] = 8;
			board[count][20] = 8;	
		}	

		int currentRow = turtle.getRow();
		int currentColumn = turtle.getColumn();

		board[currentRow][currentColumn] = 1;
		spaces = getBoard();

		for(int count = 0; count < board.length; count ++){

			for(int counter = 0; counter< board[count].length; counter++){

				if(this.board[count][counter]==0)System.out.print("  ");				if(this.board[count][counter]==1)System.out.print("* ");
				if(this.board[count][counter]==8)System.out.print("o ");
			}

			System.out.println();
		}

		if(pen.isPenClicked()==false)this.board[currentRow][currentColumn] = 0;

		this.board = spaces;

	}


}