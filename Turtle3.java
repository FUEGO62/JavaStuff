public class Turtle3{

	private int position = 0;
	private String face = "up";
	private int currentRow = 10;
	private int currentColumn = 10;

	public int getRow(){ return this.currentRow; }

	public int getColumn(){ return this.currentColumn; }	

	public String getFace(int position){

		if(this.position%4==0)this.face = "up";
		if(this.position%4==1)this.face = "right";
		if(this.position%4==2)this.face = "down"; 
		if(this.position%4==3)this.face = "left";  	

		return this.face;
	}

	public void turnRight(){

		this.position+=1;

		this.face = getFace(position);

		System.out.println("You are facing " + face);		
	}

	public void turnLeft(){

		this.position+=3;

		this.face = getFace(position);

		System.out.println("You are facing " + face);		
	}

	public void move(int move){

		Board3 turtleboard = new Board3();
		Pen3 pen = new Pen3();

		int[][] board = turtleboard.getBoard();

		if(isInRange(move)){

			for(int count = 0;count < move; count ++){

				if(this.face.equals("up"))this.currentRow--;
				if(this.face.equals("down"))this.currentRow++;
				if(this.face.equals("left"))this.currentColumn--;
				if(this.face.equals("right"))this.currentColumn++;

				if(pen.isPenClicked())board[this.currentRow][this.currentColumn]=1;
			}
		}
		else System.out.println("Out of bounds");

		turtleboard.setBoard(board);
	}

	public boolean isInRange(int move){

		boolean isInRange = false;

		if(this.face.equals("up") & currentRow-move >= 1)isInRange =  true;
		if(this.face.equals("down") & currentRow+move <=19)isInRange =  true;
		if(this.face.equals("left") & currentColumn-move>=1)isInRange =  true;
		if(this.face.equals("right") & currentColumn+move<=19 )isInRange = true;

		return isInRange;

	}

}