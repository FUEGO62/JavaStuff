
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

			counter = counter +1;}

		return factorial;


	}

	public static boolean isSquare(int number){

		float squareRoot = (float)Math.pow(number,0.5);

		float check = squareRoot*10;

		float remainder = check%10;

		if(remainder==0) return true;

		else  return false;



	}
	public static void displayArray(String[][] gameboard){

		for(int row = 0; row < gameboard.length ; row++){

			for(int column = 0; column < gameboard[row].length ; column ++ ){


				System.out.printf("%s ",gameboard[row][column]);

			}

			System.out.println("\n");

	
	}	

    }

}