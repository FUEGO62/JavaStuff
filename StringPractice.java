import java.util.Scanner;
public class BeautifyingStrings {

    public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your name: ");

	String name = input.nextLine();

	int length = name.length();

	char firstLetter = name.charAt(0);

	String upperCase = String.valueOf(firstLetter).toUpperCase();
	
	for(int count = 1; count < length; count ++ ){

		upperCase += name.charAt(count);

	}

	if((int)name.charAt(length-1) != 46)upperCase += ".";
	
	System.out.print(upperCase);

	
	
    }

}