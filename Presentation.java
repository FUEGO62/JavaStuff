public class CurrentDateAndTime{

public static void main(String[]args){

long time = System.currentTimeMillis();
long minute = time/60000;
int hour = 0;
int day = 0;
int yearcontrol = 1970;
int yearcount = 1970;
int normalYearCount =0;
int leapYearCount =0;
double yearelapsed = time/(86400000*365.24);
int yearlimit = (int)yearelapsed + yearcontrol;


for(int mcount =1;mcount<=minute;mcount+=1){

if(mcount%60==0)hour++;

}

for(int hcount =1;hcount<= hour ;hcount++){

if(hcount%24==0)day++;

}

for (int daycount = 1; daycount <= day; daycount++) {

if ((yearcount % 4 == 0 && yearcount % 100 != 0) || (yearcount % 400 == 0)) {

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
int currentYear = yearcontrol + normalYearCount +leapYearCount;

int remainingDays = day - ((normalYearCount*365) + (leapYearCount*366));

int control = 1;
int counter = 1;

int[] months ={0,31,29,31,30,31, 30, 31, 31,30 ,31 ,30,31} ;

if(currentYear % 4 ==0) months[2] =29;

if(currentYear % 4 !=0)months[2] =28;

for (int count = 1; count <= remainingDays; count ++ ){

if ((control%32)% months[counter] == 0){

counter++;

control = 0;

}
control ++;

}

System.out.printf("%02d/%02d",control,counter);

System.out.printf("/%d ",currentYear);

System.out.printf("%02d:%02d%n",(hour+1)%24,minute%60);


}//main

}//class