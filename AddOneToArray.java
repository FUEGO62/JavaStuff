import java.util.Arrays;
public class AddOneToArray{

    public static void main(String[] args){

		int [] numbers = {1,2,3};

	int wholeNumber = 0;
	int digit = 0;
	boolean isNegative = false;

	if(numbers[0]<0){numbers[0]*=-1;isNegative = true;}

		for(int count = 0; count < numbers.length; count++){

			if(numbers[count]<0 ){throw new IllegalArgumentException("Invalid number");}
	

			for(int counter = 0; counter < ((numbers.length-1)-count); counter ++ ){
	
				numbers[count]*=10;

			}

			wholeNumber += numbers[count];

		}

		if(isNegative)wholeNumber-=1;
		else wholeNumber+=1;

		int newArraySize = String.valueOf(wholeNumber).length();

		int [] newNumbers = new int [newArraySize];

		for(int count = 0; count < newNumbers.length; count++){

				digit = wholeNumber%10;

				wholeNumber/=10;

			newNumbers[(newNumbers.length-1)-count]+= digit;
		
		}

		if(isNegative)newNumbers[0]*=-1;

		System.out.print(Arrays.toString(newNumbers));

    }


}