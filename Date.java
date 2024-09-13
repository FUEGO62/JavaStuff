public class Date{

    public static boolean isLeapYear(int yearcount){

	if ((yearcount % 4 == 0 && yearcount % 100 != 0) || (yearcount % 400 == 0)) return true;

	else return false;

	}

	public static int numberOfHoursElapsed(long minute){

		int hour = 0;

		for(int mcount =1;mcount<=minute;mcount+=1){

			if(mcount%60==0)hour++;
		}

		return hour;
	}


	public static int numberOfDaysElapsed(int hour){

		int day = 0;

		for(int hcount =1;hcount<= hour ;hcount++){

			if(hcount%24==0)day++;

		}

		return day;

   	}

}

