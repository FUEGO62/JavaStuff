import java.util.Scanner;
import java.security.SecureRandom;
public class ComputerAidedTeaching{

    public static void main(String[] args){

	SecureRandom randomNumber = new SecureRandom();

	Scanner input = new Scanner(System.in);

	int count = 0;

	int userNumber = 0;

	int number1 = randomNumber.nextInt(11);

	int number2 = randomNumber.nextInt(11);

	System.out.printf("What is %d x %d ",number1,number2);

	int products = number1*number2;

	while(true){

		System.out.println("Have a go!");

		userNumber = input.nextInt();

		if(products>userNumber){System.out.println("too low");}

		if(products<userNumber){System.out.println("too high");}

		if(products==userNumber){System.out.println("CORRECT!!!");

		count ++;

		System.out.printf("You took %d attempts%n", count); break;}

	}

    }

}