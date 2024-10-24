import java.util.Random;
import java.util.ArrayList;
public class Banke{
	
	private String name = "BankeBank";
	private ArrayList<BankeAccount> accounts = new ArrayList<BankeAccount>();

	public BankeAccount getAccount(String acctNo){

		boolean found = false;
		int count = 0;

		for( count = 0; count < accounts.size();count++){

			if(accounts.get(count).getAccountNumber().equals(acctNo)){

				found = true; break;
			}
		}

		if(found==false)throw new IllegalArgumentException();

		return accounts.get(count);
	}

	public void deposit(String acctNo, double amount){

		BankeAccount account = getAccount(acctNo);

		account.deposit(amount);
	}

	public void withdraw(String acctNo, double amount){

		BankeAccount account = getAccount(acctNo);

		account.withdraw(amount);
	}

	public void transfer(double amount,String sendersAcctNo,String recipientAcctNo){

		BankeAccount senderaccount = getAccount(sendersAcctNo);
		BankeAccount recipientaccount = getAccount(recipientAcctNo);
		
		senderaccount.transfer(amount,recipientaccount);	
	}
	
	public String registerAccount(String name,String password){
	
		BankeAccount acc = new BankeAccount();
		String acctNo = "209";

    		Random random = new Random();
    		int acctNumber = random.nextInt(1000); 

		acctNo+=acctNumber;
		
		accounts.add(acc);
		acc.setAccountName(name);
		acc.setPassword(password);
		acc.setAccountNumber(acctNo);

		return acctNo;
	}

	public BankeAccount logIn(String name,String password){
	
		String details = name + password;
		int count = 0;	
		boolean found = false;

		for( count = 0; count < accounts.size();count++){

if((accounts.get(count).getAccountName()+accounts.get(count).getPassword()).equals(details)){

				found = true; break;
			}
		}

		if(found==false)throw new IllegalArgumentException("Error");
	
		else System.out.print("Log in succesfull");

		return accounts.get(count);


	}

}	