import java.util.Scanner;
import java.security.SecureRandom;
public class ArrayPractice {

public static void main(String[] args){

int total=0;

SecureRandom randomNumber = new SecureRandom();

System.out.print("Enter an array size : ");

Scanner input = new Scanner(System.in);

int array[] = new int [10];

int frequencyy[] = new int [7];

int baba = input.nextInt();

int frequency[] = new int [6];

int jesse[] = {10,8,2,6,11,4,0,1,2,6,4};

final int ARRAY_LENGTH = 10;// constant

int fuego[] = new int[ARRAY_LENGTH];

int responses[] = {1,1,2,3,4,5,5,3,3,2,4,5,1,2,3,4,5,3,2,1};



for(int count=0;count<jesse.length;count++){

if(count==10) {System.out.printf("%5s",100);}

else {System.out.printf("%02d-%02d",count*10,count*10 +9);}


for(int stars=0;stars<jesse[count];stars++){

System.out.print(" *");

}

System.out.println();


}


for(int counter=0;counter<fuego.length;counter++){

fuego[counter] = 2 + 2*counter;//assigns even numbers to the values of the arrays!!
}



System.out.printf("%s%8s%n","index","value");

for(int counter = 0; counter<fuego.length; counter++){

System.out.printf("%5d%8d%n",counter,fuego[counter]);}



for(int count =0;count<jesse.length;count++){

total+=jesse[count];}

System.out.println(total);

for(int roll = 1;roll<36;roll++){

++frequencyy[1 + randomNumber.nextInt(6)];

}

System.out.printf("%s%8s%n","Index","Value");

for(int count=1;count<frequency.length;count++){

System.out.printf("%s%8s%n",count,frequency[count]);

}

for(int count =0;count<responses.length;count++){

++frequency[responses[count]];

}

System.out.printf("%s%8s%n","Rating","Frequency");

for(int counter =1;counter<frequency.length;counter++){

System.out.printf("%d%8d%n",counter,frequency[counter]);

}

for(int number : responses){

total+=number;}//enhanced for loop!!!

System.out.println(total);

for(int counter=0;counter<jesse.length;counter++){

System.out.print("Enter a number : ");

jesse[counter] = input.nextInt();

}

for(int counter=0;counter<jesse.length;counter++){

System.out.println(jesse[counter]);

total+=jesse[counter];


}

System.out.println(total);


int [][] jessse = {{1,2,3,5},{4,5,6},{9,5,2}};

for(int row = 0; row< jessse.length ; row++){

for(int column = 0; column<jessse[row].length ;column ++ ){

System.out.printf("%d ",jessse[row][column]);

}

System.out.println();

}






}//main


}//class