import java.util.Scanner;

public class PrimeNumbers{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer ");

int primeNumber = input.nextInt();

int counter = 2;

int remainder;

int control=0;

while(counter<=primeNumber ){

remainder = primeNumber% counter;

counter = counter +1;

if(remainder==0){control = control+1;}

}
if(control>=1 & primeNumber>1)System.out.print("not a prime number");

if(primeNumber==0)System.out.print("Not a prime number");

if(primeNumber==1)System.out.print("Still under debate...");

if(control<1 & primeNumber>1)System.out.print(" prime number");






}
}