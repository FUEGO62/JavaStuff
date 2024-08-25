import java.util.Scanner;

public class Kata{

public static void main (String...args){

}

public static boolean isEven(int number){

Scanner input = new Scanner(System.in);

 number = input.nextInt();

int remainder = number%2;

if(remainder==0)return true;

else return false;
}

public static boolean isPrimeNumber(int prime){

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer ");

prime = input.nextInt();

int counter = 2;

int remainder;

int control=0;

while(counter<prime){

remainder = prime % counter;

if (remainder==0){control= control+1;}

counter = counter +1;}

if(control>=1)return false;

else return true;}

public  int subtract(int number1, int number2){

Scanner input = new Scanner(System.in);

System.out.print("Enter your first number ");

number1 = input.nextInt();

System.out.print("Enter your second number ");

 number2 = input.nextInt();

int difference = number1 - number2;

if(difference<0)difference = difference*-1;

return difference;

}

public float divide (float number1, float number2){

Scanner input = new Scanner(System.in);

System.out.print("Enter your first number ");

number1 = input.nextFloat();

System.out.print("Enter your second number ");

 number2 = input.nextFloat();

float quotient =0;

if(number2!=0) quotient = number1/number2;

if(number2==0) quotient= 0;

return quotient;

}

public int factorOf(int number){

System.out.print("Enter an integer ");

Scanner input = new Scanner(System.in);

number = input.nextInt();

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

Scanner input = new Scanner(System.in);
         
System.out.print("Enter a five digit integer: ");

number = input.nextInt();

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

public int squareOf(int number){

Scanner input = new Scanner(System.in);

number = input.nextInt();

int square = number*number;

return square;
}

public int factorialOf(int number){

System.out.print("Enter an integer ");

Scanner input = new Scanner(System.in);

number = input.nextInt();

int factorial = number;

int counter = 1;

while(counter<number){

factorial = factorial*counter;

counter = counter +1;}

return factorial;


}

public boolean isSquare(int number){

System.out.print("Enter an integer ");

Scanner input = new Scanner(System.in);

number = input.nextInt();

float squareRoot = (float)Math.pow(number,0.5);

float check = squareRoot*10;

float remainder = check%10;

if(remainder==0) return true;

else  return false;



}









}