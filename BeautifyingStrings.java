import java.util.Scanner;
public class BeautifyingStrings {

    public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a word or sentence: ");

	String name = input.nextLine();

	System.out.print(BeautifyingStrings(name));

    }

    public static String BeautifyingStrings(String name){

	
	int length = name.length();

	char firstLetter = name.charAt(0);

	String beautifulString = String.valueOf(firstLetter);

	if(startsWithCaps(firstLetter))beautifulString = String.valueOf(firstLetter).toUpperCase();
	
	for(int count = 1; count < length; count ++ ){

		beautifulString += name.charAt(count);

	}

	if (isThereFullstop(name,length)) beautifulString += ".";
	
	return beautifulString;	
	
    }

    public static boolean isThereFullstop(String name, int length){

	if((int)name.charAt(length-1) != 46) return true;

	else return false;
    }

    public static boolean startsWithCaps(char firstLetter){

	if(String.valueOf(firstLetter)!=String.valueOf(firstLetter).toUpperCase()) return true;
	else return false;

    }

}