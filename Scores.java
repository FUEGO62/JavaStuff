import java.util.Scanner;

public class Scores{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
         
System.out.print("how many students are in your class");

int number = input.nextInt();
        
int count =0;

int largest=0;
 
int score=0;

String name;

String highestName = "" ;

while(count<number){System.out.print("Enter your students name ");

name = input.next();
                                                                                                                                                                                                                                                                                                                                                    
System.out.print("Enter your students Score ");

 score = input.nextInt();

if(score>largest){


largest=score;

highestName = name;

}

count = count + 1;

}

System.out.print(highestName);






         
























	}

}
