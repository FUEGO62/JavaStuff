public class Knight{

	static int currentRow = 4;
	static int currentColumn = 3;
	
	public static void move(int move){
	
		if((currentRow +rowMoveEquivalent(move))>=0 & (currentRow +rowMoveEquivalent(move))<8 & (currentColumn +columnMoveEquivalent(move))>=0 & (currentColumn +columnMoveEquivalent(move))<8 & ChessBoard.getSpaces((currentRow +rowMoveEquivalent(move)),(currentColumn +columnMoveEquivalent(move)))==0 & move>0 & move<9){

			currentRow += rowMoveEquivalent(move);
			currentColumn += columnMoveEquivalent(move);
		
			
		}

		else System.out.println("Invalid");

	}
	
	public static int getcurrentRow(){
	
		return currentRow;
		
	}

	public static int getcurrentColumn(){
	
		return currentColumn;
	}

	public static int rowMoveEquivalent(int move){

		double rowEquivalent = (0.0265*Math.pow(move,4)- 0.4773*Math.pow(move,3)+ 2.549*Math.pow(move,2) - 3.6136*move -0.5);

		return (int)Math.round(rowEquivalent);

        }

	public static int columnMoveEquivalent(int move){

		double columnEquivalent = (-0.101*Math.pow(move,3))+(1.3636*Math.pow(move,2))-(4.6306*move)+2.4286;

		return (int)Math.round(columnEquivalent);


	}

}