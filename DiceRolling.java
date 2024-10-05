import java.security.SecureRandom;
public class DiceRolling {

    public static void main(String [] args){

	SecureRandom randomNumber = new SecureRandom();

	int [] tally = new int [11];

	int roll1 = 0;

	int roll2 = 0;

	int sum = 0;


	for(int count = 0; count< 300; count ++){

		roll1 = (1+randomNumber.nextInt(6));

		roll2 = (1+randomNumber.nextInt(6));

		sum = roll1 + roll2 ;

		tally [sum-2]++;


	
	}

	for(int count=0; count < tally.length; count ++){

		for(int counter =0 ; counter < tally[count]; counter++){

			System.out.print("=");			

		}

		System.out.println();

	}

    }

}