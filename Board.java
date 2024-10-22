import
public class Board {

	private int[][] board = new int[20][20];
	private Turtle turtle = new Turtle();
	private int row = 0;
	private int col = 0;
	private ArrayList

	public Turtle getTurtle(){

		return turtle;
	}

	public void displayBoard(){

		getCurrentPosition();

		board[row][col] = 1;

		for(int count = -2; count < board.length;count++){

			System.out.print("o ");
		}
		
		System.out.println();

		for(int count = 0; count < board.length;count++){
			
			for(int counter = 0 ; counter< board.length;counter++){

				if (counter==0)System.out.print("o ");
				if(board[count][counter]==0){
				
					if(counter ==19){System.out.print("  o");}
					else System.out.print("  ");

				}
				else {

					if(counter ==19)System.out.print("* o");
					else System.out.print("* ");
				}	
			}

			System.out.println();
		}

		for(int count = -2; count < board.length;count++){

			System.out.print("o ");
		}
		System.out.println();

	}

	public void getCurrentPosition(){

		int move = turtle.getPosition();

	        if((move%board.length)!=0)row= move/board.length;
	        else row = (move/board.length)-1;
	        col = (move-1)%board.length;

	}
}
