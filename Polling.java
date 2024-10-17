import java.util.Scanner;
public class Polling{

    public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	String [] causes = {"Racism","Moral Decadence","Tribalism","Corruption","War and Conflict"};

	int [][] responses = new int [5][10];
	int response = 0;
	double sum = 0;
	double tally = 0;
	int [] pointTotal = new int [5];
	

	System.out.print("Fill in this survey!!! \n Share with your friends and family and enter 99 to see the poll results");

	System.out.println();

	while(response != 99){

		for(int count = 0; count < causes.length; count ++){

			System.out.println(causes[count]);
			System.out.println("How important is this to you on a scale of one to ten (1-not important at all , 10 - it needs to be stopped now!!)\n");

			try{

			response = input.nextInt();
			if(response == 99)break;
			if(response!=99 & response >0 & response <11)responses[count][response-1]++;
			else {System.out.println("Invalid");count-=1;}

			}

			catch(Exception e){System.out.print("Invalid");break;}
		}

		System.out.println("Thank you for filling out this poll pass it to a friend to fill, or enter 99 to see the results \n\n");
	}

	System.out.print("Ratings:");
	System.out.printf("%9s"," ");

	for(int count = 1; count <11; count ++){

		System.out.print(count + " ");
	}

	System.out.println("\n");

	for(int count = 0 ;count< causes.length; count ++){

		System.out.print(causes[count]);
		for(int counter =0; counter<(16-causes[count].length()); counter++){

			System.out.print(" ");

		}

		for(int counter = 0; counter < responses[count].length; counter++){

			sum+= ((counter+1)*responses[count][counter]);
			pointTotal[count] +=  (counter+1)*responses[count][counter];
			tally += responses[count][counter];
			System.out.printf("%2d",responses[count][counter]);
	
		}

		if(tally!=0)System.out.print(" | "+sum/tally);
		else System.out.print(" | 0.0");
		System.out.println();
		sum = 0;
		tally = 0;

	}
	
	int largest = pointTotal[0];
	int smallest = pointTotal[0];
	int largestFlag = 0;
	int smallestFlag = 0;

	for(int count = 0 ; count < pointTotal.length; count ++){

		if(pointTotal[count]>largest){largest = pointTotal[count];largestFlag = count; }
		if(pointTotal[count]<smallest){smallest = pointTotal[count];smallestFlag=count;}	

	}

	System.out.printf("%nThe highest point total was %s with a total of %s%n",causes[largestFlag], largest );

	System.out.printf("The lowest point total was %s with a total of %s", causes[smallestFlag], smallest);


    }

}