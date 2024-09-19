import java.util.Scanner;
public class TicTacToe{

    public static void main(String[] args){

	System.out.print("Welcome to the tic-tac-toe game ,To play the game selct the position you want to enter ,click enter then type in 'x' or 'o' to input \n\n");
	
	int count = 0;
	int streakControl = 0;
	String xStreak = "[x][x][x]";
	String oStreak = "[o][o][o]";
	String total = "";
	String totalrows = "";
	String totaldiagonalright = "";
	String totaldiagonalleft = "";
	String [][] menu = {{"[1]","[2]","[3]"},{"[4]","[5]","[6]"},{"[7]","[8]","[9]"}};
	String [][]gameboard = {{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"}};

	Kata.displayArray(menu);

	Scanner input = new Scanner(System.in);	

	while(count<9){

	    System.out.println("Enter your move");

	    String move = input.nextLine();

	    switch(move){

		    case "1": gameboard[0][0] = "[" + input.nextLine() + "]"; break;
		    case "2": gameboard[0][1] = "[" + input.nextLine() + "]"; break;
		    case "3": gameboard[0][2] = "[" + input.nextLine() + "]"; break;
		    case "4": gameboard[1][0] = "[" + input.nextLine() + "]"; break;
		    case "5": gameboard[1][1] = "[" + input.nextLine() + "]"; break;
		    case "6": gameboard[1][2] = "[" + input.nextLine() + "]"; break;
		    case "7": gameboard[2][0] = "[" + input.nextLine() + "]"; break;
		    case "8": gameboard[2][1] = "[" + input.nextLine() + "]"; break;
		    case "9": gameboard[2][2] = "[" + input.nextLine() + "]"; break;
		    default : System.out.print("GET SENSE!!!!");streakControl=1;
	    }

	    if(streakControl==1)break;

	    System.out.println();
	    Kata.displayArray(gameboard);
	    count++;
	   
	    for(int counter = 0; counter <3;counter ++){
	
		for( int countest=0 ;countest<3;countest++){
	
			total+=gameboard[counter][countest];
			totalrows+=gameboard[countest][counter];
			totaldiagonalright = gameboard[0][0] + gameboard[1][1] + gameboard[2][2];
			totaldiagonalleft = gameboard[0][2] + gameboard[1][1] + gameboard[2][0];

		}

	if(total.equals(xStreak)||totalrows.equals(xStreak)||totaldiagonalright.equals(xStreak)||totaldiagonalleft.equals(xStreak)){System.out.print("x wins!!!");streakControl =1;break;}
		
		if(total.equals(oStreak)||totalrows.equals(oStreak)||totaldiagonalright.equals(oStreak)||totaldiagonalleft.equals(oStreak)){System.out.print("o wins!!!");streakControl =1;break;}

		
		total = "";
		totalrows = "";
	    }
	    
	    if(streakControl==1)break;
	
	}	
	

    }    

}