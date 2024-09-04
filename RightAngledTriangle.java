import java.util.Scanner;

public class RightAngledTriangle{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("how many do you want");

int number = input.nextInt();

String figure = "* ";

int innercount =0;

for(int counter =0; counter<number;counter++){

for(int count=0;count<innercount;count++){

System.out.print(figure);

}

innercount++;

System.out.println(figure);

}





}//main


}//class