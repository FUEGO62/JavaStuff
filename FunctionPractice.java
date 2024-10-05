import java.util.Scanner;
public class FunctionPractice{

    public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	int [][] set = new int [11][11];

	int move = 121;

	FunctionPracticeMain jesse = new FunctionPracticeMain();
	
	jesse.setMove(move);
	set = jesse.showPosition(set);
	jesse.displayArray(set);



    }

}