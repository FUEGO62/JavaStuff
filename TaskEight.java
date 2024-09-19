import java.util.Scanner;
public class TaskEight{

    public static void main(String[] args){

	float score = 0;
	float sum = 0;
	int count = 1;
	

	Scanner input = new Scanner(System.in);

	for(; count < 11; ){
	
		System.out.print("Enter your score: ");
		
		score = input.nextFloat();

		if(score>=0 && score<=100){
			sum += score;	
			count++;

		}
	}

	System.out.printf("the sum is %.2f",sum);

	System.out.printf("the average is %.2f",sum/count);
	
    }

}