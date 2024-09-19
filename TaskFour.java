import java.util.Scanner;
public class TaskFour{

    public static void main(String[] args){

	float score = 0;
	float sum = 0;

	Scanner input = new Scanner(System.in);

	for(int count = 1; count < 11; count++){
	
		System.out.print("Enter your score: ");
		
		score = input.nextFloat();

		if(count%2==0)sum += score;	
	}

	
	System.out.printf("the sum is %.2f",sum);
	
	
	
    }

}