import java.util.Scanner;

public class BackToSenderTester{

public static void main(String[]args){

Scanner input = new Scanner(System.in);

try{

System.out.print("how many parcels did you deliver: ");

int number = input.nextInt();



int wage = BackToSender.WageCalculator(number);

System.out.print(wage);

}

catch(Exception e){

System.out.print("Enter a positive whole number !!!");

}

}

}