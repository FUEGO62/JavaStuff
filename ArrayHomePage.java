import java.util.Scanner;
import java.util.Arrays;
import java.security.SecureRandom;
public class ArrayHomePage {

    public static void main(String[] args){

	SecureRandom randomNumber = new SecureRandom();
	Scanner input = new Scanner(System.in);

	long product = 1;
	int [] r = new int [10];
	int [][] t = new int [2][3];
	int [] w = new int [100];
	int [] a = new int [100];
	int [] b = new int [100];
	float [] c = new float [100];

	System.out.println(r[9]);

	t[0][1] = 0;

	int [] g = {-1,-1,-1,-1,-1,-1};
	float largest = 0;
	float smallest = 0;

	for(int counter = 0; counter < c.length; counter++){

		if(counter==0){

			largest = c[0];
			smallest = c[0];
		}


		if(c[counter]>largest){

			largest = c[counter];
		}
	
		if(c[counter]<smallest){

			smallest = c[counter];
		}
	}

	for(int counter = 0; counter < a.length; counter++){

		b[counter] = a[99-counter];

	}

	for(int counter = 2; counter < 10; counter++){

		product*=w[counter];

	}

	

	for(int row = 0; row < t.length ; row++){

		for(int column = 0; column < t[row].length ; column ++ ){

			System.out.println("Enter a number");

			t[row][column]= input.nextInt();

		}


	}

	System.out.printf(" %8s%8s%8s%n  ", "column 1", "column 2", "column 3" );

	for(int row = 0; row < t.length ; row++){

		System.out.printf("row %d  ", row+1);

		for(int column = 0; column < t[row].length ; column ++ ){


			System.out.printf("%8d ",t[row][column]);

		}

		System.out.println("\n");

	}

	System.out.println();

	System.out.printf("%d %d %d",t[0][0], t[0][1] ,t[0][2]);

	int sum = t[0][2] + t[1][2]; 

    }


}