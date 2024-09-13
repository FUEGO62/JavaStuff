import java.util.Scanner;

public class PrimeNumbers{

    public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer ");

	int prime = input.nextInt();

	int counter = 2;

	int remainder;

	int control=0;

	while(counter<prime){

		remainder = prime % counter;

		if (remainder==0){control= control+1;}

		counter = counter +1;}

	if(control>=1){System.out.print("not a prime number");}
	
	else System.out.print(" prime number");

}

}