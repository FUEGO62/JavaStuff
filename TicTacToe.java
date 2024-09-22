import java.util.Scanner;
public class TicTacToe{

    public static void main(String[] args){

	System.out.print("Welcome to the tic-tac-toe game ,To play the game selct the position you want to enter\n\n");
	int [] spacefill={0,0,0,0,0,0,0,0,0};
	int count = 1;
	int pass = 0;
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

	    String move = input.nextLine();

	    if(count%2!=0){

	    switch(move){

		    case "1": {pass = 0;spacefill[0] ++;if(spacefill[0]==1){gameboard[0][0] = "[" + "X" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;} break;}
		    case "2": {pass = 0;spacefill[1] ++;if(spacefill[1]==1){gameboard[0][1] = "[" + "X" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}  break;}
		    case "3": {pass = 0;spacefill[2] ++;if(spacefill[2]==1){gameboard[0][2] = "[" + "X" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}  break;}
		    case "4": {pass = 0;spacefill[3] ++;if(spacefill[3]==1){gameboard[1][0] = "[" + "X" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}  break;}
		    case "5": {pass = 0;spacefill[4] ++;if(spacefill[4]==1){gameboard[1][1] = "[" + "X" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}  break;}
		    case "6": {pass = 0;spacefill[5] ++;if(spacefill[5]==1){gameboard[1][2] = "[" + "X" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}  break;}
		    case "7": {pass = 0;spacefill[6] ++;if(spacefill[6]==1){gameboard[2][0] = "[" + "X" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;} break;}
		    case "8": {pass = 0;spacefill[7] ++;if(spacefill[7]==1){gameboard[2][1] = "[" + "X" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}  break;}
		    case "9": {pass = 0;spacefill[8] ++;if(spacefill[8]==1){gameboard[2][2] = "[" + "X" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}  break;}

		    default : System.out.print("INVALID INPUT");pass = 1;break;

	    }

	    }

	    if(count%2==0){

	    	switch(move){

		     case "1": {pass = 0;spacefill[0] ++;if(spacefill[0]==1){gameboard[0][0] = "[" + "O" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n");pass = 1;} break;}
		    case "2": {pass = 0;spacefill[1] ++;if(spacefill[1]==1){gameboard[0][1] = "[" + "O" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}  break;}
		    case "3": {pass = 0;spacefill[2] ++;if(spacefill[2]==1){gameboard[0][2] = "[" + "O" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}  break;}
		    case "4": {pass = 0;spacefill[3] ++;if(spacefill[3]==1){gameboard[1][0] = "[" + "O" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}  break;}
		    case "5": {pass = 0;spacefill[4] ++;if(spacefill[4]==1){gameboard[1][1] = "[" + "O" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}  break;}
		    case "6": {pass = 0;spacefill[5] ++;if(spacefill[5]==1){gameboard[1][2] = "[" + "O" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}  break;}
		    case "7": {pass = 0;spacefill[6] ++;if(spacefill[6]==1){gameboard[2][0] = "[" + "O" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;} break;}
		    case "8": {pass = 0;spacefill[7] ++;if(spacefill[7]==1){gameboard[2][1] = "[" + "O" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}  break;}
		    case "9": {pass = 0;spacefill[8] ++;if(spacefill[8]==1){gameboard[2][2] = "[" + "O" + "]";}else{System.out.print(" \n SPACE ALREADY TAKEN !!! \n"); pass = 1;}  break;}

		    default : System.out.print("INVALID INPUT");pass=1;break;

	    }
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

	if(total.equals(xStreak)||totalrows.equals(xStreak)||totaldiagonalright.equals(xStreak)||totaldiagonalleft.equals(xStreak)){System.out.print("Player 1 wins!!!");streakControl =1;break;}
		
		if(total.equals(oStreak)||totalrows.equals(oStreak)||totaldiagonalright.equals(oStreak)||totaldiagonalleft.equals(oStreak)){System.out.print("Player 2 wins!!!");streakControl =1;break;}

		
		total = "";
		totalrows = "";
	    }
	    
	    if(streakControl==1)break;
	
	}	
	
	 if(count == 10)System.out.print("Draw :( ");
    }    

}