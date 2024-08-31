import java.util.Scanner;

public class BackToSenderTester{

public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("how many parcels did you deliver");

int number = input.nextInt();

int wage = BackToSender.WageCalculator(number);

System.out.print(wage);

}

}