import java.util.Scanner;
public class MrChibuzosArrayTask{

	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("How many elements are in your array: ");

	int arraySize = input.nextInt();

	int numbers[] = new int [arraySize];
	int largest = 0;
	int smallest = 0;
	double total = 0;

	for(int counter = 0; counter < numbers.length; counter++){

		System.out.print("Enter your numbers : ");

		numbers[counter] = input.nextInt();

		total += numbers[counter];

		if(counter==0){

			largest = numbers[0];
			smallest = numbers[0];
		}


		if(numbers[counter]>largest){

			largest = numbers[counter];
		}
	
		if(numbers[counter]<smallest){

			smallest = numbers[counter];
		}
	}

	displayArray(numbers);	

	System.out.println("The average is "+total/numbers.length);
	System.out.println("The largest number is "+ largest);
	System.out.println("The smallest number is "+ smallest);

    }

    public static void displayArray(int [] array){

	System.out.println();

	System.out.printf("%s%8s%n","index","value");

	for(int counter = 0; counter < array.length; counter++){

		System.out.printf("%d%8d%n",counter,array[counter]);
	
	}

	System.out.println();

    }

}