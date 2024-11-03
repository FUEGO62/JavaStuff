import java.util.ArrayList;
import java.util.Scanner;
public class ATMachine{

    public static void main(String[] args){

	Banke bank = new Banke();
	BankeAccount acc = new BankeAccount();
	Scanner input = new Scanner(System.in);

	System.out.printf("Welcome to Banke bank%n1.)To create an account%n2.)Log in%n3.)Deposit%n4.)Withdraw money%n5.)Check Account balance%n6.)Transfer%n7.)Change Pin%n8.)Close Account%n");

	String move ="";
	String name = "";
	String password = "";
	String acctNo = "";
	double amount = 0;

	try{

	while(!move.equals(99)){

		System.out.print("Select an option: ");

		move = input.nextLine();
	switch(move){

		 

		case "1": {
			System.out.println("Enter your name: ");
			
			name = input.nextLine();

			System.out.println("Enter your password: ");
			
			password = input.nextLine();

			acctNo = bank.registerAccount(name , password);

			System.out.printf("Sign up succesful , your account number is %s%n",acctNo);

			break;}


		case "2": {

			System.out.println("Enter your name: ");
			
			name = input.nextLine();

			System.out.println("Enter your password: ");
			
			password = input.nextLine();

			acc = bank.logIn(name , password);

		break;}

		case "3":{

			if(acc.getAccountName().equals("")){System.out.println("You need to log in first");}		else {

				System.out.println("How much do you want to deposit");

				amount = input.nextDouble();
				
				acc.deposit(amount);

				if(amount>0)System.out.println("Done");


			}

		break;}

		case "4":{

			if(acc.getAccountName().equals("")){System.out.println("You need to log in first");}		else {

				System.out.println("How much do you want to withdraw");

				amount = input.nextDouble();
				
				acc.withdraw(amount);

				if(amount>0 & amount < acc.getBalance())System.out.println("Done");

			}

		break;}

		case "5":{

			if(acc.getAccountName().equals("")){System.out.println("You need to log in first");}	else {

				System.out.println(acc.getBalance());			

			}

		break;}
	
		case "6":{

			if(acc.getAccountName().equals("")){System.out.println("You need to log in first");}	else {

			System.out.println("How much do you want to transfer");

			amount = input.nextDouble();

			System.out.println("Who do you want to tramsfer to (i.e enter their account number)");
				
			acctNo = input.nextLine();
			acctNo = input.nextLine();

			acc.transfer( amount , bank.getAccount(acctNo));

			if(amount>0 & amount < acc.getBalance())System.out.println("Done");


			}

		break;}

		case "7":{

			if(acc.getAccountName().equals("")){System.out.println("You need to log in first");}	else {

				System.out.print("Enter new pin");

				password = input.nextLine();

				acc.setPassword(password);

				System.out.println("Password has changed");
			}

		break;}

		case "8":{

			if(acc.getAccountName().equals("")){System.out.println("You need to log in first");}	else {

				acc = new BankeAccount();

				System.out.println("Account closed");
			}

		break;}

		default: {System.out.println(":(");break;}

	}

	}

	}

	catch(Exception e ){System.out.print("\nUh oh :( , something went wrong restart program and enter correct credentials");}

	

    }

}