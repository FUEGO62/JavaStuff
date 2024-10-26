import java.util.Scanner;
import java.util.ArrayList;
public class Afeez{

    public static void main(String[] args){

	Contact contact = new Contact();
	PhoneBook phonebook = new PhoneBook();
	ArrayList<Contact> matches = new ArrayList<Contact>();
	Scanner input = new Scanner(System.in);
	String firstName = "";
	String lastName = "";
	String phoneNumber = "";
	String move = "";

	System.out.printf("%n1.)Add contact%n2.)Remove contact%n3.)find contact by phone number%n4.)find contact by first name%n5.)find contact by last name%n6.)edit contact%n");

	while(!move.equals("99")){

		move = input.nextLine();

		switch(move){

			case "1":{

				System.out.println("Enter first name");

				firstName = input.nextLine();

				System.out.println("Enter last name");

				lastName = input.nextLine();

				System.out.println("Enter phone number");

				phoneNumber = input.nextLine();

				if(phoneNumber.length()==11){phonebook.addContact(firstName,lastName,phoneNumber);System.out.println("Done");}

				else System.out.println("invalid phone number!!");

			break;} 

			case "2":{

				System.out.println("Enter phone number of contact you wish to remove");
				phoneNumber = input.nextLine();

				if(phoneNumber.length()==11)phonebook.removeContact(phoneNumber);

				else System.out.println("invalid phone number!!");


			break;}

			case "3":{
				
				System.out.println("Enter phone number of contact you wish to find");
				phoneNumber = input.nextLine();

				matches = phonebook.findPhoneNumber(phoneNumber);

				displayMatches(matches);


			break;}

			case "4":{
				
				System.out.println("Enter first name of contact you wish to find");
				firstName = input.nextLine();

				matches = phonebook.findFirstName(firstName);

				displayMatches(matches);


			break;}

			case "5":{
				
				System.out.println("Enter last name of contact you wish to find");
				lastName = input.nextLine();

				matches = phonebook.findLastName(firstName);

				displayMatches(matches);


			break;}

			case "6":{
				
				System.out.println("Enter phone number of contact you wish to edit");
				phoneNumber = input.nextLine();

				System.out.println("Enter the new name ");
				
				firstName = input.nextLine();

				if(phoneNumber.length()==11)phonebook.edit(phoneNumber,firstName);

				else System.out.println("invalid phone number!!");


			break;}


			default: System.out.println("invalid");


		}

	}
	

    }

    public static void displayMatches(ArrayList<Contact> matches){

	if(matches.size()!=1)System.out.printf("%d matches found...%n",matches.size());
	else System.out.printf("%d match found...%n",matches.size());

	for(int count = 0; count < matches.size(); count++){

		System.out.printf("%d.) ",count+1);

		System.out.print(matches.get(count).getFirstName() + " ");

		System.out.print(matches.get(count).getLastName() + " : ");

		System.out.println(matches.get(count).getPhoneNumber());

	}

    }

}