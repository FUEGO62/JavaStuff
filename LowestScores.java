import java.util.Scanner;

public class LowestScores{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
         
System.out.print("how many students are in your class");

int number = input.nextInt();
        
int count =0;

int smallest=101;

int secondsmallest = 100;

while(count<number){

System.out.print("Enter your students Score ");

int score = input.nextInt();

if(score<smallest){smallest=score;}

count = count + 1;

if(score>smallest & score<secondsmallest){secondsmallest=score;}

}

System.out.printf("The smallest is %d%n",smallest);

System.out.printf("The second smallest is %d ",secondsmallest);




	}

}
