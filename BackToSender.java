public class BackToSender{

public static int WageCalculator(int parcelSize){

int wage=0;

if(parcelSize<50){ wage = (parcelSize*160)+5000;}

if(parcelSize>=50 & parcelSize<=59){ wage = (parcelSize*200)+5000;}

if(parcelSize>=70){ wage = (parcelSize*500)+5000;}

if(parcelSize>=60 & parcelSize<=69){ wage = (parcelSize*250)+5000;}

return wage;
}







}