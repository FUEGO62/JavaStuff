import java.util.Scanner;
public class converMillis  {

    public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your time in milliseconds: ");

	long time = input.nextLong();

	System.out.print(convertMillis(time));

    }

   public static String convertMillis(long time){

	long secondCount = time/1000;

	long minuteCount=time/60000;

	long hourCount =time/3600000;

	return hourCount + ":" + (minuteCount%60) + ":" + (secondCount%60); 

    }

}