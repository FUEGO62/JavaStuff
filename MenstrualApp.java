import java.util.Scanner;
public class MenstrualApp{

    public static void main(String[]args){

      try{
	
	Scanner input = new Scanner(System.in);
	String date = "";

	System.out.print("Welcome to semicolon's Menstrual cycle aid, what is your name?\nEnter name here: ");

	String name = input.nextLine();

	System.out.printf("%nok , %s lets get started , when did your last period start?\n(i.e how many days ago...)  ",name);

	int periodStart = input.nextInt();

	if(periodStart>35){

		System.out.printf("Dear %s that sound kinda ... off we suggest you meet your doctor to see if you're in perfect health%n ",name);

		throw new IllegalArgumentException();

		}	

	if(periodStart<0){System.out.printf("you should probable see a doctor %s ",name);

		throw new IllegalArgumentException();}

	else date = PastDateAndTime.getpastTime(periodStart);

	System.out.printf("How many days did it last? if you are experiencing it right now just enter how long it normally lasts (:\n(i.e 5) :");

	int duration = input.nextInt();

	if(duration>7 || duration<3){System.out.printf("Dear %s that sound kinda ... off we suggest you meet your doctor to see if you're in perfect health%n ",name);
	
	throw new IllegalArgumentException();
	
	}	

	System.out.println("How often do you have your period?\n1.) once a month\n2.)a little more than a month\n3.)a little less than a month\n4.)None of the above\n5.)I'm not really sure\n");
	
	int cycleLength = input.nextInt();

	if(cycleLength==1)cycleLength=28;
	if(cycleLength==2)cycleLength=35;	
	if(cycleLength==3)cycleLength=21;
	if(cycleLength==4){System.out.printf("Dear %s that sound kinda ... off we suggest you meet your doctor to see if you're in perfect health%n ",name);throw new IllegalArgumentException();}
	if(cycleLength==5) {System.out.printf("We suggest you take this month to consciously keep track of your period dates%n(i.e when your period starts,when it ends and the intervals between)");throw new IllegalArgumentException();}

	int cycleEnd = (cycleLength - periodStart)*-1;
	String menstrualCycleEnd = PastDateAndTime.getpastTime(cycleEnd);

	if(periodStart+1>0 & periodStart+1 <= duration){System.out.printf("You are probably experiencing your period now it will end in %d days%n%n",duration - periodStart);}

	System.out.printf("Your safe days are likely between %s and %s and also between %s and %s for this cycle %n%n",PastDateAndTime.getpastTime(-1*(6-periodStart)),PastDateAndTime.getpastTime(-1*(13-periodStart)),PastDateAndTime.getpastTime(-1*((cycleLength-2)-periodStart)),PastDateAndTime.getpastTime(-1*(cycleLength-periodStart)));

	System.out.printf("Your viable days(i.e the days you are most likely to get pregnant) are between %s and %s%n",PastDateAndTime.getpastTime(-1*(14-periodStart)),PastDateAndTime.getpastTime(-1*((cycleLength-3)-periodStart)));

	System.out.printf("Your next period is most likely going to start on %s",PastDateAndTime.getpastTime(-1*(cycleLength-(periodStart-1))));

  }

  catch(Exception e){System.out.print("\nHave a good day");}
    }

}