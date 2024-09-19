import java.util.Scanner;
import java.util.ArrayList;
import java.security.SecureRandom;
public class ArrayListHomePage {

    public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	SecureRandom randomNumber = new SecureRandom();

	ArrayList<String> jesse = new ArrayList<String>();

	jesse.add("j");
	jesse.add("e");
	jesse.add("s");
	jesse.add("s");
	jesse.add("e");

	for(int count = 0; count<jesse.size(); count++){

		System.out.print(jesse.get(count));	

	}

	

	

    }

}