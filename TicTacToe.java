import java.util.Scanner;
public class TicTacToe{

    public static void main(String[] args){

	System.out.print("Welcome to the tic-tac-toe game ,To play the game selct the position you want to enter\n\n");

	boolean isDraw = true;
	int [] spacefill=new int [9];
	int count = 1;
	int pass = 0;
	int row =0;
	int column = 0;
	int streakControl = 0;
	String x = "[X]";
	String o = "[O]";
	String blank = "[ ]";
	String xStreak = "[X][X][X]";
	String oStreak = "[O][O][O]";
	String total = "";
	String totalrows = "";
	String totaldiagonalright = "";
	String totaldiagonalleft = "";
	String [][] menu = {{"[1]","[2]","[3]"},{"[4]","[5]","[6]"},{"[7]","[8]","[9]"}};
	String [][]gameboard = {{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"}};

	Kata.display2DArray(menu);

	Scanner input = new Scanner(System.in);	

	while(count<=9){

	    System.out.println(count%2==0?"Player 2 Enter your move" :"Player1 Enter your move");

	    int move = input.nextInt();

	    if(count%2!=0 & count <10 & count > 0 ){

		if((move%gameboard.length)!=0)row= move/gameboard.length;
		else row = (move/gameboard.length)-1;
 
		column = (move-1)%gameboard.length;

		pass = 0;

		spacefill[move-1] ++;

		if(spacefill[move-1]==1){gameboard[row][column] = "[" + "X" + "]";}
		else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;} 
		 
	    }


	    if(count%2==0 & count > 0 & count <10){

	    	if((move%gameboard.length)!=0)row= move/gameboard.length;
		else row = (move/gameboard.length)-1;
 
		column = (move-1)%gameboard.length;

		pass = 0;
		spacefill[move-1] ++;

		if(spacefill[move-1]==1){gameboard[row][column] = "[" + "O" + "]";}
		else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}


		    	 }
	     	  
	      
	    if(streakControl==1)break;

	    System.out.println();
	    Kata.display2DArray(gameboard);
	    if(pass == 0)count++;
	   
	    for(int counter = 0; counter <3;counter ++){
	
		for( int countest=0 ;countest<3;countest++){
	
			total+=gameboard[counter][countest];
			totalrows+=gameboard[countest][counter];
			totaldiagonalright = gameboard[0][0] + gameboard[1][1] + gameboard[2][2];
			totaldiagonalleft = gameboard[0][2] + gameboard[1][1] + gameboard[2][0];

		}

	if(total.equals(xStreak)||totalrows.equals(xStreak)||totaldiagonalright.equals(xStreak)||totaldiagonalleft.equals(xStreak)){System.out.print("Player 1 wins!!!");streakControl =1;isDraw=false;break;}
		
		if(total.equals(oStreak)||totalrows.equals(oStreak)||totaldiagonalright.equals(oStreak)||totaldiagonalleft.equals(oStreak)){System.out.print("Player 2 wins!!!");streakControl =1;isDraw = false;break;}

		
		total = "";
		totalrows = "";
	    }
	    
	    if(streakControl==1)break;
	
	}	
	
	if(isDraw){System.out.println("Its a draw :(");}

    }    

}