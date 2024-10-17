import java.util.ArrayList;
import java.util.Scanner;
public class MavenAccountDriverClass{

    public static void main(String[] args){

	Bank bank = new Bank();
	MavenAccount acc = new MavenAccount();
	Scanner input = new Scanner(System.in);

	String name1 = "dayo";
	String name2 = "jesse";

	String acctNo1 = bank.registerAccount(name1);
	String acctNo2 = bank.registerAccount(name2);

	bank.getAccount(acctNo1).deposit(10000);

	System.out.println(bank.getAccount(acctNo1).getBalance());
	System.out.println(bank.getAccount(acctNo2).getBalance());

	bank.getAccount(acctNo1).transfer(100 ,bank.getAccount(acctNo2));

	System.out.println(bank.getAccount(acctNo1).getBalance());
	System.out.println(bank.getAccount(acctNo2).getBalance());


    }

}