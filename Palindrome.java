
import java.util.Scanner;

public class Palindrome{

	public static void main(String[] args){

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

          if(number==palindrome){ System.out.printf("%d is a palindrome", number);}

          if(number!=palindrome){ System.out.printf("%d is not a palindrome", number);}
      




	}



}