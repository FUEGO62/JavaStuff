public class PastDateAndTime{

    public static void main(String[]args){

	System.out.print(getpastTime(0));

    }

     public static String getpastTime(int daysAgo){

	long time = System.currentTimeMillis();
	long minute = time/60000;
	int hour = 0;
	int day = 0;
	int baseyear = 1970;
	int yearcount = 1970;
	int normalYearCount = 0;
	int leapYearCount =0;
	double yearelapsed = time/(86400000*365.24);
	int yearlimit = (int) yearelapsed + baseyear;
		
	hour = Date.numberOfHoursElapsed(minute);
	day = Date.numberOfDaysElapsed(hour)-daysAgo;

	for (int daycount = 1; daycount <= day; daycount++) {

		if (Date.isLeapYear(yearcount)) {

			if (daycount % 366 == 0) {

				leapYearCount++;
				yearcount++;
			}

		} 

		else {
       
			if (daycount % 365 == 0) {

				normalYearCount++;
				yearcount++;

				}
			}

		if(yearcount>yearlimit-1)break;
	}

	if (((hour+1)%24)<1) {day++;} 

	int currentYear = baseyear + normalYearCount +leapYearCount;

	int remainingDays = day - ((normalYearCount*365) + (leapYearCount*366));

	int currentDay = 1;
	int currentMonth = 1;

	int[] months ={0,31,29,31,30,31, 30, 31, 31,30 ,31 ,30,31} ;

	if(Date.isLeapYear(currentYear)) months[2] =29;

	else months[2] =28;

	for (int count = 1; count <= remainingDays; count ++ ){

		if ((currentDay%32)% months[currentMonth] == 0){

			currentMonth++;

			currentDay = 0;
		}

		currentDay ++;
	}

	String date = "" + currentDay + "/" + currentMonth + "/" + currentYear;

	return date;
	
	}

}