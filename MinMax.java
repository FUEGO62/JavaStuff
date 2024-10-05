import java.util.Arrays;
public class MinMax{

    public static void main(String[] args){

	int [] input = {3,5,8,9,10};

	int [] max = getLargest(input);

	int [] minMax = getSmallest(input,max);

		
	System.out.print(Arrays.toString(minMax));
		



    }

 public static int[] getLargest(int[] array){

	int largest = array[0];

	int [] minMax = new int [2];
	

	for(int count = 1; count<array.length; count++){
		
		if(array[count]>largest){largest = array[count];}
		}

	minMax[1] = largest; 

	return minMax;
    }
	
    public static int[] getSmallest(int[] array ,int[]  minMax ){

	int smallest = array[0];
	

	for(int count = 1; count<array.length; count++){
		
		if(array[count]<smallest){smallest = array[count];}
		}

	minMax[0] = smallest;

	return minMax;
    }


}