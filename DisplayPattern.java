import java.util.*;

public class DisplayPattern{

    public static void main(String[] args){

	System.out.println("How many do you want");

	Scanner input = new Scanner(System.in);

	int number = input.nextInt();

	displayPattern(number);

	}

	public static void displayPattern(int n){

		int spacecontrol = n;

		for(int count=1;count<=n;count++){

			for(int space =spacecontrol;space>0;space--){

			System.out.print(" ");

			}

			for(int counter =1;counter<count;counter++){

			System.out.print(counter);

			}

			System.out.println(count);	

			spacecontrol--;

		}


	}

}