public class FindingTheMode{

    public static void main(String [] args){

	int [] set ={5,15,15,5,15,5, 15};

	int flag = 0;

	int [] tally = new int [set.length];

	for(int count = 0; count< set.length; count ++){

		for(int counter = 0; counter< set.length; counter++){

			if(set[count]==set[counter]){tally[count]++;}

		}

	}

	for(int count = 0; count<tally.length; count++){

		System.out.print(tally[count] + " ");

	} 



	int largest = tally[0];

	for(int count = 0; count<tally.length; count++){

		if(tally[count]>largest){largest = tally[count];flag=count;}

	} 

	System.out.print("\nThe mode is " + set[flag]);

    }

}