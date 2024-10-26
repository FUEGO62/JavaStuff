public class BankeAccount{

	private int balance = 0;
	private String accountNumber = "";
	private String name = "";
	private String password = "";

	public void setPassword(String password){
	
		this.password = password;
	}

	public String getPassword(){
	
		return password;
	}

	public void setAccountName(String name){

		this.name = name;
	}

	public String getAccountName(){

		return name;
	}
	
	public void setAccountNumber(String number){

		accountNumber = number;
	}

	public String getAccountNumber(){

		return accountNumber;
	}

	public double getBalance(){

		return balance;
	}

	public void deposit(double amount){

		if(amount>0)this.balance+=amount;
		else System.out.println("Invalid");
	}

	public void withdraw (double amount){

		if(balance>=amount){
	
			if(amount>0)this.balance-=amount;
		}

		else System.out.print("Invalid");
	}

	public void transfer (double amount, BankeAccount recipient){

		if(amount>0 & balance>=amount){
			recipient.deposit(amount);
			balance-=amount;
		}

		else System.out.println("Invalid");
	}
}