import java.util.Scanner;
public class ZellersCongruence{

    public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	String [] days = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};

	int[] daysInMonths ={0,31,29,31,30,31, 30, 31, 31,30 ,31 ,30,31} ;


	System.out.print("Enter year: (e.g.,2012): ");

	int year = input.nextInt();

	while(year<0){

		System.out.println("Invalid input for year pls re-enter");

		year = input.nextInt();

	}

	System.out.print("Enter month: 1-12: ");

	int month = input.nextInt();

	while(month>12||month<1){

		System.out.println("Invalid range for months pls re-enter");

		 month = input.nextInt();

	}

	System.out.print("Enter the day of the month: 1-31: ");

	int day = input.nextInt();

	while(day>daysInMonths[month]){

		System.out.println("There arent that many days in that month pls re-enter");
		day = input.nextInt();

	}

	if(month ==1 || month ==2){

		month+=12;
		year-=1;

	}

	int m = month;
	int j = year/100;
	int k = year%100;
	int q = day;

	int h = (  q + (26*(m+1)/10) + k + k/4 + j/4 + 5*j )%7;

	System.out.printf("The day is %s",days[h]);	
	

    }

}