import java.util.Scanner;

public class Calculator{

public static void main (String[] args){

Scanner input = new Scanner(System.in);

System.out.printf("1->Find out whether your integer is Even%n2->Find out whether your integer is Prime or not%n3->Find the difference of your integers%n4->find the quotient of your numbers%n5->Find out how many factors your integers has%n6->Find out if your number is a square number%n7->Find out whether your integer is a palindrome%n8->Find out the factorial of your number%n9->Square your number%n");

int userInput = input.nextInt();

switch(userInput){

case 1: eventime();break;

case 2: primetime();break;

case 3: subtract();break;

case 4: quotient();break;

case 5: numberOfFactors();break;

case 6: isSquare();break;

case 7: palindrome();break;

case 8: factorial();break;

case 9: square();break;

}//switch

}//main

public static void primetime(){

System.out.printf("Enter a number%n");

Scanner input = new Scanner(System.in);

int number = input.nextInt();

boolean hello = Kata.isPrimeNumber(number);

if(hello==true)System.out.printf("%d is a prime number",number);


if(hello==false)System.out.printf("%d is not a prime number",number);
}//prime time

public static void eventime(){

System.out.printf("Enter a number%n");

Scanner input = new Scanner(System.in);

int number = input.nextInt();

boolean hello = Kata.isEven(number);

if(hello==true)System.out.printf("%d is an even number",number);


if(hello==false)System.out.printf("%d is an odd number",number);
}//even time

public static void subtract(){

Scanner input = new Scanner(System.in);

System.out.printf("Enter your first number%n");

int number1 = input.nextInt();

System.out.printf("Enter your second number%n");

int number2 = input.nextInt();

int difference = Kata.subtract(number1,number2);

System.out.printf("your difference is %d",difference);

}//subtract

public static void quotient(){

Scanner input = new Scanner(System.in);

System.out.printf("Enter your first number%n");

float number1 = input.nextFloat();

System.out.printf("Enter your second number%n");

float number2 = input.nextFloat();

float quotient = Kata.divide(number1,number2);

System.out.printf("your quotient is %.2f",quotient);

}//quotient

public static void numberOfFactors(){

Scanner input = new Scanner(System.in);

System.out.printf("Enter your number%n");

int number1 = input.nextInt();

int factor = Kata.factorOf(number1);

System.out.printf("your number has %d factors",factor);

}//factors

public static void palindrome(){

System.out.printf("Enter a 5 digit number%n");

Scanner input = new Scanner(System.in);

int number = input.nextInt();

boolean hello = Kata.isPalindrome(number);

if(hello==true)System.out.printf("%d is a palindrome",number);

else System.out.printf("%d is not a palindrome",number);

}//palindrome

public static void square(){

Scanner input = new Scanner(System.in);

System.out.printf("Enter your number%n");

int number1 = input.nextInt();

int factor = Kata.squareOf(number1);

System.out.printf("the square of your number is %d ",factor);

}//square


public static void factorial(){

Scanner input = new Scanner(System.in);

System.out.printf("Enter your number%n");

int number1 = input.nextInt();

int factor = Kata.factorialOf(number1);

System.out.printf("the factorial of your number is %d ",factor);

}//square

public static void isSquare(){

System.out.printf("Enter a number%n");

Scanner input = new Scanner(System.in);

int number = input.nextInt();

boolean hello = Kata.isSquare(number);

if(hello==true)System.out.printf("%d is a square number",number);


if(hello==false)System.out.printf("%d is not a square number",number);
}//prime time



}//class