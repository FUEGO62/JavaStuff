import java.util.Scanner;

public class ScopeKata{

public static void main(String[]args){

mainMenu();

}

public static void isEven(){

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer");

int number = input.nextInt();

int remainder = number%2;

if(remainder==0)System.out.print("even number!!");

else System.out.print("odd number");

mainMenu();
}

public static void isPrimeNumber(){

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer ");

int prime = input.nextInt();

int counter = 2;

int remainder;

int control=0;

while(counter<prime){

remainder = prime % counter;

if (remainder==0){control= control+1;}

counter = counter +1;}

if(control>=1)System.out.print("Not a Prime number!!");

else System.out.print("Prime number!!");;}

public static void subtract(){

Scanner input = new Scanner(System.in);

System.out.print("Enter your first number ");

int number1 = input.nextInt();

System.out.print("Enter your second number ");

int number2 = input.nextInt();

int difference = number1 - number2;

if(difference<0)difference = difference*-1;

System.out.print(difference);

mainMenu();

}

public static void divide (){

Scanner input = new Scanner(System.in);

System.out.print("Enter your first number ");

float number1 = input.nextFloat();

System.out.print("Enter your second number ");

float number2 = input.nextFloat();

float quotient =0;

if(number2!=0) quotient = number1/number2;

if(number2==0) quotient= 0;

System.out.print(quotient);

mainMenu();
}

public static void factorOf(){

System.out.print("Enter an integer ");

Scanner input = new Scanner(System.in);

int number = input.nextInt();

int counter = 1;

int remainder;

int control=0;

while(counter<=number){

remainder = number % counter;

if (remainder==0){control= control+1;}

counter = counter +1;}

System.out.print(control);

mainMenu();


}

public static void isPalindrome(){

Scanner input = new Scanner(System.in);
         
System.out.print("Enter a five digit integer: ");

int number = input.nextInt();

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

if(number==palindrome)System.out.print("Yes, your number is a palindrome");

else System.out.print("NO, your number is not sa palindrome");
      
mainMenu();

}

public static void squareOf(){

Scanner input = new Scanner(System.in);

int number = input.nextInt();

int square = number*number;

System.out.print(square);

mainMenu();
}

public static void factorialOf(){

System.out.print("Enter an integer ");

Scanner input = new Scanner(System.in);

int number = input.nextInt();

int factorial = number;

int counter = 1;

while(counter<number){

factorial = factorial*counter;

counter = counter +1;}

System.out.print(factorial);

mainMenu();


}

public static void isSquare(){

System.out.print("Enter an integer ");

Scanner input = new Scanner(System.in);

int number = input.nextInt();

float squareRoot = (float)Math.pow(number,0.5);

float check = squareRoot*10;

float remainder = check%10;

if(remainder==0) System.out.print("Yes it is a square number");

else  System.out.print("NO it is not a square number");

mainMenu();
}



public static void mainMenu(){

Scanner input = new Scanner(System.in);

System.out.printf("1->Find out whether your integer is Even%n2->Find out whether your integer is Prime or not%n3->Find the difference of your integers%n4->find the quotient of your numbers%n5->Find out how many factors your integers has%n6->Find out if your number is a square number%n7->Find out whether your integer is a palindrome%n8->Find out the factorial of your number%n9->Square your number%n");

int userInput = input.nextInt();

switch(userInput){

case 1: isEven();break;

case 2: isPrimeNumber();break;

case 3: subtract();break;

case 4: divide();break;

case 5: factorOf();break;

case 6: isSquare();break;

case 7: isPalindrome();break;

case 8: factorialOf();break;

case 9: squareOf();break;

}


}





}