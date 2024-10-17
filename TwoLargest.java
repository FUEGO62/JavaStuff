public class TwoLargest{

    public static void main(String[]args){

	int [] arr = {3,6,2,5,7};
  	int flag = 0;
	int [] largestArray = new int [2];
	int largest = arr[0];

	for(int count = 0; count < 2; count++){

		for(int counter = 0; counter < arr.length; counter++){

			if(arr[counter]>largest){largest=arr[counter];flag=counter;}
		}

		largestArray[count] = largest;
		arr[flag]=0;
		largest = 0;
	}

	System.out.print(largestArray[0] + " " + largestArray[1]);

    }

}