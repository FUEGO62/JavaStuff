import java.util.Scanner;
public class JesseAirlines {

    public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	boolean [] seats = new boolean[10];

	int economySeatFiller = 5;

	int firstClassSeatFiller = 0;

	int count = 0;

	while(count<10){Airline(seats, input,economySeatFiller,firstClassSeatFiller);count++;}
    }

    public static void Airline(boolean[] seats, Scanner input,int economySeatFiller,int firstClassSeatFiller){

	System.out.print("1.) For first class \n2.) For Economy\n");

	String choice = input.nextLine();


		switch(choice){

			case "1": {

				firstClassSeatFiller++;

				seats[firstClassSeatFiller-1] = true;

				Kata.displayArray(seats);
				System.out.println();
			
			break;}

			case "2": {economySeatFiller++;

				seats[economySeatFiller-1] = true;

				Kata.displayArray(seats);
				System.out.println();

			break;}


			default : System.out.print("1 or 2");


		}


    }

}
