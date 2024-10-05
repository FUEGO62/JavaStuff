import java.security.SecureRandom;
import java.util.Scanner;
public class DuplicateElimination {

    public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	int duplicateChecker = 0;

	int number = 0;

	int [][] table = new int [5][6];

	int [] numbers = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

	int count = 0;

	while(count<10){

		System.out.print("Enter your numbers ");

		number = input.nextInt();

		if(number>=10 & number<=100){

			numbers[count] = number;
		
			count++;
	
		}

	}
	

	for(int i = 0; i < numbers.length; i++){

		for(int counter = 0; counter < numbers.length; counter++){

			if(numbers[i] == numbers[counter])duplicateChecker++;
			

		}

		if(duplicateChecker>1){numbers[i]=-1;}
		duplicateChecker = 0;
	
	}

	for(int i = 0;i<numbers.length;i++){

		if(numbers[i]!=-1)System.out.printf("%d%n%n",numbers[i]);
	
	}

		//EXCERSISE 7.13

	int label = 1;
	
	 for (int col = 0; col < 6; col++){

 		for (int row = 0; row < 5; row++){
  
 			table[row][col] = label;

			label++;

			System.out.printf("[%02d] ",table[row][col]);
 
		}

		System.out.println();
	
	}

	System.out.println(getAverage(10,5,12,67,33,9));

	
    }

	//EXCERCISE 7.14

    public static double getAverage(double ... numbers){

	double sum = 0;

	for(double d : numbers){

		sum += d;

	}

	return sum/numbers.length;

    }


}
