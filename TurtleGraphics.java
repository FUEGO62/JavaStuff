import java.util.Scanner;
public class TurtleGraphics{

    public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	int [][] board = new int [21][21];
	boolean isPenDown = false;
	int currentRow = 19;
	int currentColumn = 10;
	board[currentRow][currentColumn] = 1;
	int position = 0;
	String face = "up";
	int distance = 0;
	int move = 0;
	boolean outOfBounds = false;

	
	for(int count = 0; count < board.length ; count++){

		board[0][count] = 8;
		board[count][0] = 8;
		board[20][count] = 8;
		board[count][20] = 8;	
	}

	System.out.print("1-> Pen up\n2-> Pen down\n3->Turn right\n4->Turn left\n5,x->move forward by x spaces\n6->Display\n9->End\n");

	display2DIntArray(board);

	board[currentRow][currentColumn] = 0;

	System.out.print("START! you are facing up\n");

	while(move!=9){

	
	move = input.nextInt();


	switch(move){

		default: {if(move!=9)System.out.println("Not a command !");break;}
	
		case 1: {isPenDown = false;System.out.println("Pen is up");break;}
	
		case 2: {isPenDown = true;System.out.println("Pen is down");break;}

		case 3: {

			position++; 

			if((position%4)==1){face = "right";System.out.println("you are facing right");}
			if((position%4)==2){face = "down";System.out.println("you are facing down");}
			if((position%4)==3){face = "left";System.out.println("you are facing left");}
			if((position%4)==0){face = "up";System.out.println("you are facing up");}

		break;}

		case 4: {

			position+=3; 

			if((position%4)==1){face = "right";System.out.println("you are facing right");}
			if((position%4)==2){face = "down";System.out.println("you are facing down");}
			if((position%4)==3){face = "left";System.out.println("you are facing left");}
			if((position%4)==0){face = "up";System.out.println("you are facing up");}

		break;}

		
		case 5: { 

			distance = input.nextInt();

			if(face.equals("right")){
				
				if(distance>=(20-currentColumn)){System.out.print("Out of bounds\nEnter 5 to try again or 3 or 4 to change direction\n");outOfBounds=true;}


				if(distance < (20-currentColumn)){
	
					for(int count = 0; count < distance ; count++){

						if(isPenDown)board[currentRow][currentColumn] = 1;	

						currentColumn++;			
					}
				}
	
			}

			if(face.equals("up")){

				if(distance > (currentRow - 1)){System.out.print("Out of bounds\nEnter 5 to try again or 3 or 4 to change direction\n");outOfBounds=true;}

				if(distance <=(currentRow - 1)){

	
					for(int count = 0; count < distance ; count++){

						if(isPenDown)board[currentRow][currentColumn] = 1;	

						currentRow--;			
					}
				}

			}

			if(face.equals("left")){

				if(distance > (currentColumn - 1)){System.out.print("Out of bounds\nEnter 5 to try again or 3 or 4 to change direction\n");outOfBounds=true;}

				if(distance <=(currentColumn - 1)){
	
					for(int count = 0; count < distance ; count++){

						if(isPenDown)board[currentRow][currentColumn] = 1;	

						currentColumn--;			
					}
				}

			}
			
			if(face.equals("down")){

				if(distance >=(20-currentRow)){System.out.print("Out of bounds\nEnter 5 to try again or 3 or 4 to change direction\n");outOfBounds=true;}

				if(distance < (20-currentRow)){
	
					for(int count = 0; count < distance ; count++){

						if(isPenDown)board[currentRow][currentColumn] = 1;	

						currentRow++;			
					}
				}		
			}
			
			if(outOfBounds) outOfBounds = false;
			else board[currentRow][currentColumn] = 1;
		break;}

		case 6: display2DIntArray(board);board[currentRow][currentColumn] = 0;
 

	}

	}

    }

    public static void display2DIntArray(int [][] gameboard){

		for(int row = 0; row < gameboard.length ; row++){

			for(int column = 0; column < gameboard[row].length ; column ++ ){


				if(gameboard[row][column]==0)System.out.print("  ");
				if(gameboard[row][column]==1)System.out.print("* ");
				if(gameboard[row][column]==8)System.out.print("o ");
			}

			System.out.println();
	
	        }	

	}

}