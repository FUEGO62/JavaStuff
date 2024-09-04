import java.util.Scanner;

public class GasMileage{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

float totalmiles = 0;

float miles = 1;

float totalgallons = 0;

float totalmileage =0;

System.out.println("Use program to calculate mileage and get your total mileage press 00 to quit");

while(miles!=0){

System.out.println("Enter distance in miles");

miles = input.nextFloat();

if(miles==0)break;

totalmiles += miles;

System.out.println("Enter gallons consumed");

float gallons = input.nextFloat();

totalgallons += gallons;

float mileage = miles/gallons;

System.out.println("your mileage is " +mileage);

totalmileage = totalmiles/totalgallons;

}
System.out.println("your total mileage is " +totalmileage);

}//main
}//class
