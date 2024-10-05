public class ChessBoard{

 	private Knight horse = new Knight();
	private int [][] chessboard = new int [8][8];
	private int currentRow = Knight.getcurrentRow();
	private int currentColumn = Knight.getcurrentColumn();
	private int [][] spaces = new int [8][8];
	private int position = spaces[currentRow][currentColumn];

	public void showPosition(){

		this.currentRow = Knight.getcurrentRow();
		this.currentColumn = Knight.getcurrentColumn();

		for(int count = 1; count<9; count ++){
		
		try{chessboard[(currentRow + horse.rowMoveEquivalent(count))][(currentColumn + horse.columnMoveEquivalent(count))] = count;}

		catch(Exception e){}
		
		}

	}	

	public void resetPosition(){

		this.currentRow = Knight.getcurrentRow();
		this.currentColumn = Knight.getcurrentColumn();

		for(int count = 1; count<9; count ++){
		
		try{chessboard[(currentRow + horse.rowMoveEquivalent(count))][(currentColumn + horse.columnMoveEquivalent(count))] = 0;}

		catch(Exception e){}
		
	
		}

	}	
	
	public void displayBoard(){

		chessboard[currentRow][currentColumn] = 22;
		spaces[currentRow][currentColumn] = 1;

		for(int count = 0; count < chessboard.length; count++ ){

			for(int counter = 0; counter < chessboard.length; counter++){

				if(chessboard[count][counter]==22)System.out.print("K ");
				if(chessboard[count][counter]==0)System.out.print(". ");
				if(chessboard[count][counter]!=22 &chessboard[count][counter]!=0) System.out.print(chessboard[count][counter] + " ");
								
			}

			System.out.println();

		}

		System.out.println();

	}
		

}