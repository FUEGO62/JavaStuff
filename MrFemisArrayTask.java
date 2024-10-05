public class MrFemisArrayTask {

    public static void main(String[]args){

	int[] numbers = {5,10,2,1,7};
	int[] sums = selectiveSum(numbers);
	int [] arrayOfLargestAndSmallest = new int[2];
	arrayOfLargestAndSmallest[1] = getLargest(sums);
	arrayOfLargestAndSmallest[0] = getSmallest(sums);
	displayArray(sums);
	displayArray(arrayOfLargestAndSmallest);
	System.out.println("the number trashed to get the largest sum is "+getTrashedNumbersforLargest(arrayOfLargestAndSmallest[1],sums,numbers));
	System.out.println("the number trashed to get the Smallest sum is "+getTrashedNumbersforSmallest(arrayOfLargestAndSmallest[0],sums,numbers));

    }


    public static int getLargest(int[] sums){

	int largest = sums[0];
	

	for(int count = 1; count<sums.length; count++){
		
		if(sums[count]>largest){largest = sums[count];}
		}


	return largest;
    }

     public static int getSmallest(int[] sums){

	int smallest = sums[0];

	for(int count = 1; count<sums.length; count++){
		
		if(sums[count]<smallest){smallest = sums[count];}

		}
	return smallest;

    }

    public static int[] selectiveSum(int [] numbers){

	int [] sums = new int [numbers.length];

	int sum = 0;

	for(int count=0; count<numbers.length; count ++){
	
		for(int counter = 0; counter<numbers.length; counter++){
	
			sum += numbers[counter];

		}

		sums[count] = sum - numbers[count];
		sum = 0;
		
	}

	return sums;

    }

    public static void displayArray(int [] sums){

	for(int count = 0; count<sums.length; count++){
		
		System.out.print(sums[count]+" ");	
	
	}

	System.out.println();
    }

    public static int getTrashedNumbersforLargest(int largest,int[] sums,int[] numbers){

	int count = 0;

	while(true){if(sums[count]==largest)break; count++;}

	return numbers[count];


    }

  public static int getTrashedNumbersforSmallest(int smallest,int[] sums,int[] numbers){

	int count = 0;

	while(true){if(sums[count]==smallest)break; count++;}

	return numbers[count];


    }


}