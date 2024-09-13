import java.util.*;

public class ReverseNumber{

	public static void main(String[] args){

	System.out.println("Enter your four-digit number");

	Scanner input = new Scanner(System.in);

	int number = input.nextInt();

	reverse(number);

	}

public static void reverse(int number){

	int unit = number%10;
	
	int digit2 = number/10;

	int tens = digit2%10;

	int digit3 = digit2/10;

	int hundreds = digit3%10;

	int digit4 = digit3/10;

	int thousands = digit4%10;

	int reverseNumber =thousands + 10*hundreds + (100*tens) + (1000*unit);

	System.out.printf("%04d",reverseNumber);

}	

}