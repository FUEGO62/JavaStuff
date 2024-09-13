public class Accounts{

	private String name;
	private double balance;

	public void setName(String name){

		this.name = name;

	}

	public Accounts(String name, double balance ) {

		this.name = name;

		if(balance>0.0){this.balance = balance;}

	}

	public String getName(){

		return name;

	}

	public void deposit( double deposit){

		if(deposit>0.0)balance += deposit;

	}

	public double getBalance(){

		return balance;
	}

}