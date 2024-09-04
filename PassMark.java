import java.util.Scanner;

public class PassMark{

	public static void main(String[] args){

          Scanner input = new Scanner(System.in);
         
          System.out.print("Enter your score");

          int number = input.nextInt();

          if(number>=60){System.out.printf("You pass the exam");}
          if(number<60) {System.out.printf("You don't pass the exam");}



}

}
