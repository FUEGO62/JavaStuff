import java.util.Scanner;
public class PrintAsterix{

    public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a size: ");

	int size = input.nextInt();

	 printAsterix(size);

   }

    public static void printAsterix(int size){

	for(int count = 0; count < size; count ++){

		for(int counter = 0; counter < size; counter++){

			System.out.print("* ");

		}

		System.out.println();

	}

    }
}
