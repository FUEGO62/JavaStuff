import java.util.*;

public class DecreasingNumber{

	public static void main(String[] args){

	System.out.println("Enter 3 numbers");

	Scanner input = new Scanner(System.in);

	double largest = input.nextDouble();

	double smallest = input.nextDouble();

	double middle = input.nextDouble();

	if(smallest > largest) smallest = largest;

	if(middle > largest) middle = largest;

	if(middle < smallest) middle = smallest;

	if(largest < smallest) largest = smallest;

	if(largest>middle & middle>smallest) middle = middle;

		System.out.printf("%.0f,%.0f,%.0f",largest,middle,smallest);	

	}

}