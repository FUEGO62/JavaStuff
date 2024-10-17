public class Customer{

	private String name = "";
	Bank bank = new Bank();

	public MavenAccount createAccount(){

		MavenAccount acc = new MavenAccount();
		 bank.setAccounts(acc);

		return acc;
	}

	public void setName(String name){

		this.name = name;
	}

}