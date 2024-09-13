import java.util.*;

public class DistanceConversion{

	public static void main(String[] args){

	System.out.println("Enter your distance");

	Scanner input = new Scanner(System.in);

	Double number = input.nextDouble();

public static double mileToKilometer(double mile){

return mile*1.60934;

}

public static double kilometerToMile(double kilometer){

return kilometer*0.621371;

}
