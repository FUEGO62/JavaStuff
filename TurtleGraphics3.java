import java.util.Scanner;
public class TurtleGraphics3{

    public static void main(String [] args){

	System.out.print("1-> Pen up\n2-> Pen down\n3->Turn right\n4->Turn left\n5 then x->move forward by x spaces\n6->Display\n9->End\n");

	Board3 player = new Board3();

	player.displayBoard();
	System.out.println("You are facing up");

	playGame();

    }

    public static void playGame(){

	try{

		Pen3 pen = new Pen3();
		Turtle3 turtle = new Turtle3();
		Board3 board = new Board3();

		int move = 0;
		int distance = 0;

		Scanner input = new Scanner(System.in);

		while(move!=9){

			move = input.nextInt();

			switch(move){

				case 1: pen.unClick();break;
	
				case 2: pen.click();break;

				case 3: turtle.turnRight();break;
	
				case 4: turtle.turnLeft();break;

				case 5: {distance = input.nextInt();

				turtle.move(distance);break;

				}

				case 6: board.displayBoard();break;

				default: if(move!=9)System.out.println("Invalid");
			}

		}

	}
	catch(Exception e){System.out.println("Invalid");playGame();}

    }

}