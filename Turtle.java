public class Turtle{

	static int position = 0;
	static String face = "up";
	static int currentRow = 10;
	static int currentColumn = 10;

	public static int getRow(){ return currentRow; }

	public static int getColumn(){ return currentColumn; }	

	public static String getFace(int position){

		if(position%4==0)face = "up";
		if(position%4==1)face = "right";
		if(position%4==2)face = "down"; 
		if(position%4==3)face = "left";  	

		return face;
	}

	public static void turnRight(){

		position+=1;

		face = getFace(position);

		System.out.println("You are facing " + face);		
	}

	public static void turnLeft(){

		position+=3;

		face = getFace(position);

		System.out.println("You are facing " + face);		
	}

	public static void move(int move){

		int[][] board = Board.getBoard();

		if(isInRange(move)){

			for(int count = 0;count < move; count ++){

				if(face.equals("up"))currentRow--;
				if(face.equals("down"))currentRow++;
				if(face.equals("left"))currentColumn--;
				if(face.equals("right"))currentColumn++;

				if(Pen.isPenClicked())board[currentRow][currentColumn]=1;
			}
		}
		else System.out.println("Out of bounds");

		Board.setBoard(board);
	}

	public static boolean isInRange(int move){

		boolean isInRange = false;

		if(face.equals("up") & currentRow-move >= 1)isInRange =  true;
		if(face.equals("down") & currentRow+move <=19)isInRange =  true;
		if(face.equals("left") & currentColumn-move>=1)isInRange =  true;
		if(face.equals("right") & currentColumn+move<=19 )isInRange = true;

		return isInRange;

	}

}