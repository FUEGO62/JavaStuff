import java.util.Scanner;
public class TurtleGraphics2{

    public static void main(String [] args){

	System.out.print("1-> Pen up\n2-> Pen down\n3->Turn right\n4->Turn left\n5 then x->move forward by x spaces\n6->Display\n9->End\n");

	Board.displayBoard();
	System.out.println("You are facing up");

	playGame();

    }

    public static void playGame(){

	try{

		int move = 0;
		int distance = 0;

		Scanner input = new Scanner(System.in);

		while(move!=9){

			move = input.nextInt();

			switch(move){

				case 1: Pen.unClick();break;
	
				case 2: Pen.click();break;

				case 3: Turtle.turnRight();break;
	
				case 4: Turtle.turnLeft();break;

				case 5: {distance = input.nextInt();

				Turtle.move(distance);break;

				}

				case 6: Board.displayBoard();break;

				default: if(move!=9)System.out.println("Invalid");
			}

		}

	}
	catch(Exception e){System.out.println("Invalid");playGame();}

    }

}