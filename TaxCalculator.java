import java.util.Scanner;

public class TaxCalculator {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter your name");

String name = input.nextLine();

System.out.print("How much do you earn?: ");

float earnings = input.nextFloat();

if(earnings<=30000){

float tax = (earnings*15)/100;

System.out.println(tax);

}

if(earnings>30000){

float tax = (earnings*20)/100;

System.out.println(tax);


}





}//main

}//class
