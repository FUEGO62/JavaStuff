import java.util.Scanner;

public class JesseCodes {

public static void main(String[] args){

System.out.print("Enter an integer ");

Scanner input = new Scanner(System.in);

int number = input.nextInt();

float squareRoot = (float)Math.pow(number,0.5);

float check = squareRoot*10;

float remainder = check%10;

if(remainder==0)System.out.print("Square number");

else System.out.print("Not a Square number");


}

}
