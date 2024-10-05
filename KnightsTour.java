import java.util.Arrays;
import java.util.Scanner;
public class KnightsTour{

    public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	String [][] board = new String [8][8];
	
	int squares = 0;
	int currentRow = 6;
	int currentColumn = 6;

	for(int count = 0; count< board.length; count ++){

		for(int counter =0; counter < board.length; counter++){
	
			board[count][counter] = ".";
		}
	
	}

	while(squares < 64){

	try{board[currentRow][currentColumn] = "K";}catch(Exception e){}


	board = setOptions(board,currentRow,currentColumn);
	displayBoard(board);
	board = resetOptions(board,currentRow,currentColumn);
	

	String move = input.nextLine();

	switch(move){

		case "8": try{currentRow+=2;currentColumn-=1;}catch(Exception e){}break;
		case "1": try{currentRow+=2;currentColumn+=1;}catch(Exception e){}break;
		case "2": try{currentRow-=2;currentColumn-=1;}catch(Exception e){}break;
		case "3": try{currentRow-=2;currentColumn+=1;}catch(Exception e){}break;
		case "4": try{currentRow+=1;currentColumn-=2;}catch(Exception e){}break;
		case "5": try{currentRow+=1;currentColumn+=2;}catch(Exception e){}break;
		case "6": try{currentRow-=1;currentColumn-=2;}catch(Exception e){}break;
		case "7": try{currentRow-=1;currentColumn+=2;}catch(Exception e){}break;

	}
	
	board = setOptions(board,currentRow,currentColumn);

	try{board[currentRow][currentColumn] = "K";}catch(Exception e){System.out.print("out of bounds\n");}
	
	squares++;	

	}

	
    }

    public static void displayBoard(String [][] board){

	for(int count = 0; count< board.length; count ++){

		for(int counter =0; counter < board.length; counter++){
	
			System.out.print(board[count][counter] + " ");

		}
	
		System.out.println();
	}


    }

    public static String[][] setOptions(String  [][] board, int currentRow, int currentColumn ){

	try{board[currentRow+2][currentColumn-1] = "8";}catch(Exception e){}
	try{board[currentRow+2][currentColumn+1] = "1";}catch(Exception e){}
	try{board[currentRow-2][currentColumn-1] = "2";}catch(Exception e){}
	try{board[currentRow-2][currentColumn+1] = "3";}catch(Exception e){}
	try{board[currentRow+1][currentColumn-2] = "4";}catch(Exception e){}
	try{board[currentRow+1][currentColumn+2] = "5";}catch(Exception e){}
	try{board[currentRow-1][currentColumn-2] = "6";}catch(Exception e){}
	try{board[currentRow-1][currentColumn+2] = "7";}catch(Exception e){}

	return board;

    }

    public static String[][] resetOptions(String [][] board, int currentRow, int currentColumn ){

	try{board[currentRow+2][currentColumn-1] = ".";}catch(Exception e){}
	try{board[currentRow+2][currentColumn+1] = ".";}catch(Exception e){}
	try{board[currentRow-2][currentColumn-1] = ".";}catch(Exception e){}
	try{board[currentRow-2][currentColumn+1] = ".";}catch(Exception e){}
	try{board[currentRow+1][currentColumn-2] = ".";}catch(Exception e){}
	try{board[currentRow+1][currentColumn+2] = ".";}catch(Exception e){}
	try{board[currentRow-1][currentColumn-2] = ".";}catch(Exception e){}
	try{board[currentRow-1][currentColumn+2] = ".";}catch(Exception e){}

	return board;
    }

}