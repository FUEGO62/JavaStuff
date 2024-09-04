import java.util.Scanner;

public class CreditLimitCalculator {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter your Account number");

int accountNumber = input.nextInt();

System.out.println("Enter your current balance");

int currentBalance  = input.nextInt();

System.out.println("Enter your charges and expenditure");

int totalCharges  = input.nextInt();

System.out.println("Enter your current credit applied ");

int creditsApplied  = input.nextInt();

System.out.println("Enter your current credit limit ");

int creditLimit = input.nextInt();

int finalbalance = currentBalance + totalCharges - creditsApplied;

if(finalbalance>creditLimit){System.out.println("Credit limit exceeded");}

if(finalbalance<creditLimit){System.out.println("Thankyou for banking with us!");}

}

}