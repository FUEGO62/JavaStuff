import java.util.Random;
import java.util.ArrayList;
public class Bank{
	
	private String name = "MavenBank";
	private ArrayList<MavenAccount> accounts = new ArrayList<MavenAccount>();

	public MavenAccount getAccount(String acctNo){

		boolean found = false;
		int count = 0;

		for( count = 0; count < accounts.size();count++){

			if(accounts.get(count).getAccountNumber().equals(acctNo)){

				found = true; break;
			}
		}

		if(found==false) System.out.print("Error");

		return accounts.get(count);
	}

	public void deposit(String acctNo, double amount){

		MavenAccount account = getAccount(acctNo);

		account.deposit(amount);
	}

	public void withdraw(String acctNo, double amount){

		MavenAccount account = getAccount(acctNo);

		account.withdraw(amount);
	}

	public void transfer(double amount,String sendersAcctNo,String recipientAcctNo){

		MavenAccount senderaccount = getAccount(sendersAcctNo);
		MavenAccount recipientaccount = getAccount(recipientAcctNo);
		
		senderaccount.transfer(amount,recipientaccount);	
	}
	
	public String registerAccount(String Name){
	
		MavenAccount acc = new MavenAccount();
		String acctNo = "209";

    		Random random = new Random();
    		int acctNumber = random.nextInt(1000); 

		acctNo+=acctNumber;
		
		accounts.add(acc);
		acc.setAccountName(Name);
		acc.setAccountNumber(acctNo);

		return acctNo;
	}

}	