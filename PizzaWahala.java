import java.util.Scanner;

public class PizzaWahala{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("_________________________________________________");

System.out.printf("|%s|%8s|%8s|%n","    Pizza type ","Number of Slices","Price per box ");

System.out.printf("|%6s|%16s|%14s|%n","1.) Sapa Size  ","4","2,200 ");

System.out.printf("|%6s|%16s|%14s|%n","2.) Small Money","6","2,400 ");

System.out.printf("|%6s|%16s|%14s|%n","3.) Big boys   ","8","3,000 ");

System.out.printf("|%6s|%16s|%14s|%n","4.) Odogwu     ","12","4,200 ");

System.out.println("________________________________________________");

System.out.println();

int numberOfBoxes = 0;

int price = 0;

System.out.print("Place your order...(i.e '3' for 'Big boys') :");

int order = input.nextInt();

System.out.println();

System.out.print("How many people are eating? :");

System.out.println();

int number = input.nextInt();

switch(order){

case 1: {order = 4;



numberOfBoxes = number/order;

if(number%order==0){System.out.printf("You should buy %d boxes!!",numberOfBoxes);

System.out.printf("%nyour price is #%d",2200*(numberOfBoxes));
}

if(number%order!=0){System.out.printf("You should buy %d boxes!!",numberOfBoxes+1);

System.out.printf("%nyour price is #%d",2200*(numberOfBoxes+1));

}




break;}

case 2: {order = 6;

numberOfBoxes = number/order;

if(number%order==0){System.out.printf("You should buy %d boxes!!",numberOfBoxes);

System.out.printf("%nyour price is #%d",2400*(numberOfBoxes));}

if(number%order!=0){System.out.printf("You should buy %d boxes!!",numberOfBoxes+1);

System.out.printf("%nyour price is #%d",2400*(numberOfBoxes+1));}

break;}

case 3: {order = 8;

numberOfBoxes = number/order;

if(number%order==0){System.out.printf("You should buy %d boxes!!",numberOfBoxes);

System.out.printf("%nyour price is #%d",3000*(numberOfBoxes));}

if(number%order!=0){System.out.printf("You should buy %d boxes!!",numberOfBoxes+1);

System.out.printf("%nyour price is #%d",3000*(numberOfBoxes+1));}

break;}

case 4: {order = 12;

numberOfBoxes = number/order;

if(number%order==0){System.out.printf("You should buy %d boxes!!",numberOfBoxes);

System.out.printf("%nyour price is #%d",4200*(numberOfBoxes));}

if(number%order!=0){System.out.printf("You should buy %d boxes!!",numberOfBoxes+1);

System.out.printf("%nyour price is #%d",4200*(numberOfBoxes+1));}


break;}





}//switch



}//main

}//class