import java.util.Scanner;
public class ChessPlayer{

    public static void main(String [] args){

		
	Scanner input = new Scanner(System.in);
	ChessBoard board = new ChessBoard();
	int move = 0;


	for(int count = 0;count<64; count ++){
	
		board.showPosition();
		board.displayBoard();
		board.resetPosition();
		move = input.nextInt();
		Knight.move(move);
	
	}
    }

}