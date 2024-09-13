import java.util.Scanner;
import java.util.Arrays;
import java.security.SecureRandom;
public class ArrayHomePage {

    public static void main(String[] args){

	SecureRandom randomNumber = new SecureRandom();

	int total=0;

	int frequency[] = new int [6];

	Arrays.fill(frequency,7);



	int responses[] = {1,1,2,3,4,5,5,32,3,2,4,5,1,2,3,4,5,3,2,14};	

	final byte ARRAY_LENGTH = 10;

	int fuego[] = new int[ARRAY_LENGTH];

	int [][] jesse = new int [2][2];

	for(int row = 0; row< jesse.length ; row++){

		for(int column = 0; column<jesse[row].length ;column ++ ){

			System.out.printf("%s ",jesse[row][column]);

		}

		System.out.println();

	}





   }

}