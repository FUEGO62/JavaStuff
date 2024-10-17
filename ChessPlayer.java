import java.util.Scanner;
public class ChessPlayer{

    public static void main(String [] args){

	int spaces = 100;
	playGame(spaces);
	
	}

    public static void playGame(int spaces){

	Scanner input = new Scanner(System.in);
	ChessBoard board = new ChessBoard();
	int move = 0;
	
	for(int count = 0;count<spaces; count ++){
	
		board.showPosition();
		board.displayBoard();
		board.resetPosition();
		try{move = input.nextInt();}
		catch(Exception e){move = 0;}
		Knight.move(move);
	
	}
	

	
    }

}