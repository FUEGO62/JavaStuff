import java.security.SecureRandom;
import java.util.Scanner;
public class DuplicateElimination {

    public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	int duplicateChecker = 0;

	int number = 0;

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

		if(numbers[i]!=-1)System.out.printf("%d ",numbers[i]);
	
	}

    }


}
