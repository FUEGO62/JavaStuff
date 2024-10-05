import java.util.Scanner; 
public class AccountsTester {
    public static void main(String[] args) {


	Scanner input = new Scanner(System.in);

	Accounts myAccount = new Accounts("jesse",1000);  

	System.out.printf("Initial name is: %s%n%n",myAccount.getName() );

	System.out.println("Please enter the name:"); 

	String theName = input.nextLine();

	System.out.println("Please deposit:"); 

	double deposit = input.nextDouble();

	myAccount.deposit(deposit);

	myAccount.setName(theName);       

	System.out.println(); 

	System.out.printf("Name in object myAccount is:%n%s%n",myAccount.getName());

	System.out.printf("balance in object myAccount is:%n%s%n",myAccount.getBalance());


   }

}