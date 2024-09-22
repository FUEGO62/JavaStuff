
public class Kata{


	public boolean isEven(int number){

		int remainder = number%2;

		if(remainder==0)return true ;
		
		else return false;
		

	}


	public static boolean isPrimeNumber(int prime){

		int counter = 2;

		int remainder;

		int control=0;

		while(counter<prime){

			remainder = prime % counter;

			if (remainder==0){control= control+1;}

			counter = counter +1;
		}

		if(control>=1)return false;

		else return true;}

	public static int subtract(int number1, int number2){

		int difference = number1 - number2;

		if(difference<0)difference = difference*-1;

		return difference;

	}

	public static float divide (float number1, float number2){

		float quotient =0;

		if(number2!=0) quotient = number1/number2;

		if(number2==0) quotient= 0;

		return quotient;

	}

	public static int factorOf(int number){

		int counter = 1;

		int remainder;

		int control=0;

		while(counter<=number){

			remainder = number % counter;

			if (remainder==0){control= control+1;}

			counter = counter +1;}

		return control;


	}

	public static boolean isPalindrome(int number){

		int unit = number%10;
	
		int digit2 = number/10;

		int tens = digit2%10;

		int digit3 = digit2/10;

		int hundreds = digit3%10;

		int digit4 = digit3/10;

		int thousands = digit4%10;

		int digit5 = digit4/10;

		int tenthousands = digit5%10;

		int palindrome = tenthousands+ 10*thousands + 100*hundreds + (1000*tens) + (10000*unit);

		if(number==palindrome) return true;

		else return false;
      

	}

	public static int squareOf(int number){

		int square = number*number;

		return square;
	}

	public static int factorialOf(int number){

		int factorial = number;

		int counter = 1;

		while(counter<number){

			factorial = factorial*counter;

			counter = counter +1;
		}

		return factorial;

	}

	public static boolean isSquare(int number){

		float squareRoot = (float)Math.pow(number,0.5);

		float check = squareRoot*10;

		float remainder = check%10;

		if(remainder==0) return true;

		else  return false;



	}

	public static void display2DArray(String[][] gameboard){

		for(int row = 0; row < gameboard.length ; row++){

			for(int column = 0; column < gameboard[row].length ; column ++ ){


				System.out.printf("%s ",gameboard[row][column]);

			}

			System.out.println("\n");
	
	        }	

	}

	public static int getLargest(int [] array){
	
		int largest = array[0];

		for(int count = 1; count < array.length; count++){

			if(array[count]>largest)largest=array[count];

		}
		
		return largest;

	}

	public static int[] reverseIntArray(int [] array){
	
		int [] reversedArray = new int[array.length];

		for(int count = 0; count < array.length; count++){

			reversedArray[(array.length-1)-count]=array[count];

		}
		
		return reversedArray;

	}

	public static void displayArray(char [] array){
	
		for(int count = 0; count < array.length; count++){

			System.out.print(array[count]+" ");

		}
		
	}

	public static boolean checkArray(int [] array, int number){

		int counter = 0;
	
		for(int count = 0; count < array.length; count++){

			if(array[count] == number)counter++;

		}


		if(counter>0)return true;
		else return false;
	}


	public static void displayEvenArray(int [] array){
	
		for(int count = 0; count < array.length; count++){

			if((count+1)%2==0)System.out.print(array[count]+" ");

		}
		
	}
	
	public static void displayOddArray(int [] array){
	
		for(int count = 0; count < array.length; count++){

			if((count+1)%2!=0)System.out.print(array[count]+" ");

		}
		
	}

	public static int sumArray(int [] array){

		int total = 0;
	
		for(int count = 0; count < array.length; count++){

			total += array[count];

		}
 
		return total;
	}

	public static boolean isStringPalindrome(String word){

		int counter = 0;

		char []wordArray =new char [word.length()];
	
		for(int count = 0; count < word.length(); count++){

			wordArray[count] =word.charAt(count);

		}
		for(int count = 0; count < word.length(); count++){

			if(wordArray[word.length()-1-count] == wordArray[count])counter++;

		}

		if (counter == word.length()) return true;
		else return false;
		

	}
	public static char[] reverseCharArray(char [] array){
	
		char [] reversedArray = new char[array.length];

		for(int count = 0; count < array.length; count++){

			reversedArray[(array.length-1)-count]=array[count];

		}
		
		return reversedArray;

	}
	public static char[] fuseArrays(char[] array1, int[] array2){

		String sum = "";
		char []concatenatedList = new char[array1.length+array2.length];
	
		for(int count = 0; count<array1.length;count++){

			sum += array1[count];
		}

		for(int count = 0; count<array2.length;count++){

			sum += array2[count];
		}

		for(int count = 0; count<concatenatedList.length;count++){

			concatenatedList[count] = sum.charAt(count);
		}


		return concatenatedList;
}
	public static char[] fuseAlternateArrays(char[] array1, int[] array2){

		String sum1 = "";
		String sum2 = "";
		int counter = 0;
		char []concatenatedList = new char[array1.length+array2.length];
	
		for(int count = 0; count<array1.length;count++){

			sum1 += array1[count];
		}

		for(int count = 0; count<array2.length;count++){

			sum2 += array2[count];
		}

		for(int count = 0; count<sum1.length();count++){

			concatenatedList[counter] = sum1.charAt(count);

			counter+=2;

		}
		counter = 1;

		for(int count = 0; count<sum2.length();count++){
		
			concatenatedList[counter] = sum2.charAt(count);

			counter +=2;
		}

	
		return concatenatedList;
}


	public static char[] putInList(int number){

		String name =  String.valueOf(number);
		char[] list = new char [name.length()];
		for(int count = 0; count<list.length;count++){
		
			list[count] = name.charAt(count);
		
		}

		return list;

	}

}//class