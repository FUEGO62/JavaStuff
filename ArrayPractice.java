import java.security.SecureRandom;
public class ArrayPractice {

public static void main(String[] args){

int total=0;

SecureRandom randomNumber = new SecureRandom();

int array[] = new int [10];

int frequencyy[] = new int [7];

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

System.out.print(total);

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



}//main


}//class