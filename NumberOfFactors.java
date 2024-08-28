import java.util.Scanner;

public class NumberOfFactors{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer ");

int number = input.nextInt();

int counter = 1;

int remainder;

int control=0;

while(counter<=number){

remainder = number % counter;

if (remainder==0){control= control+1;}

counter = counter +1;}

System.out.printf("%d has %d factors",number,control);


}

}