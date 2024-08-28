import java.util.Scanner;

public class StandardDeviation{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("How many numbers are in your population?");

int count = input.nextInt();

float total=0;

int control=0;

float datapointer;

float deviation;

float square =0;

float totaldeviation=0;

int control2 = 0;

float datapoint;

while(control < count){System.out.print("Enter your numbers");

datapoint = input.nextFloat();

total = total + datapoint;

control = control + 1;}

float average = total/count;

float mean= average;

while(control2 < count){System.out.print("Please re-enter your numbers");

datapointer = input.nextFloat();

deviation = datapointer-mean;

square = deviation*deviation;

totaldeviation = totaldeviation + square;

control2 = control2 + 1; }

float variance =totaldeviation/count;

float standardDeviation= (float)Math.pow(variance, 0.5);

System.out.printf("the standard deviation is %f",standardDeviation);


}

}