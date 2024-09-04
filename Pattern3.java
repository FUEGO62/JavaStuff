public class Pattern3{

public static void main(String[] args){

String figure = "*";

int innerCounter = 5;

for(int count=0;count<6;count=count +1){

for(int counter=0;counter<innerCounter;counter=counter +1){System.out.print(figure);}

innerCounter = innerCounter -1;

System.out.println(figure);




}

}

}