import java.util.Scanner;
public class TaskSeven{

    public static void main(String[] args){

	float score = 0;
	float sum = 0;
	int counter = 0;

	Scanner input = new Scanner(System.in);

	for(int count = 1; count < 11; count++){
	
		System.out.print("Enter your score: ");
		
		score = input.nextFloat();

		if(score%2==0){
			sum += score;	
			counter++;

		}
	}

	System.out.printf("the sum is %.2f",sum);

	System.out.printf("the average is %.2f",sum/counter);
	
    }

}