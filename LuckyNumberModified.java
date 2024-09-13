import java.util.Scanner;
import java.security.SecureRandom;

public class LuckyNumberModified{

    public static void main(String[] args){

	SecureRandom randomNumber = new SecureRandom();
	Scanner input = new Scanner(System.in);

	int count = 0;
	int counter = 0;
	int userNumber = 0;

	System.out.println("Welcome to the Lucky number guessing game, ");

	int luckyNumber = randomNumber.nextInt(11);

	while(true){

		System.out.println("Have a go!");

		userNumber = input.nextInt();

		count++; 

		if(luckyNumber>userNumber){System.out.println("too low");}

		if(luckyNumber<userNumber){System.out.println("too high");}

		if(luckyNumber==userNumber){System.out.println("CORRECT!!!");

			System.out.printf("You took %d attempts%n", count); break;
		}

	}

	if(count<10)System.out.print("Either you know the secret or you got lucky!");
	if(count==10)System.out.print("Aha! You know the secret");
	if(count==10)System.out.print("You should be able to do better! Why should it take more then 10 guesses");


   }

}