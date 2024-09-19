import java.util.Scanner;
public class TaskOne{

    public static void main(String[] args){

	String xStreak = "[x][x][x]";
	String total = "";
	String [][]gameboard = {{"[x]","[ ]","[ ]"},{"[x]","[ ]","[ ]"},{"[x]","[ ]","[ ]"}};

	

	for(int counter = 0; counter <3;counter ++){
	
		for( int count=0 ;count<3;count++){
	
			total+=gameboard[count][counter];

		}

		if(total.equals(xStreak)){System.out.print(total);}
		total = "";
	}

	
	
    }

}