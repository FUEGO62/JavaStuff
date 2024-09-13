import java.util.Scanner;
public class EnhancedStandardDeviation{

	public static void main(String[] args){

	float total = 0;
	float deviation = 0;
	float totalDeviation=0;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("How many numbers are in your population? : ");

	int poppulationSize = input.nextInt();

	float frequency[] = new float [poppulationSize];

	for(int counter = 0; counter < frequency.length; counter++){

		System.out.print("Enter your data points : ");

		frequency[counter] = input.nextFloat();

		total += frequency[counter];
	
		}

	float average = total/poppulationSize;

	for(int count =0; count < frequency.length ; count++){

		deviation = (float)Math.pow(frequency[count]-average,2);

		totalDeviation += deviation;

		}

	float variance = totalDeviation/poppulationSize;
	float standardDeviation = (float)Math.pow(variance,0.5);
	System.out.print(standardDeviation);

	}

}

