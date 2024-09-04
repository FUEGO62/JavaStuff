import java.util.*;

public class MrChibuzorsSpecialPattern{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

String figure = "* ";

System.out.printf("How many do you want%n");

int size = input.nextInt();

int innerCounter = 0;

for(int count=0;count<size;count=count +1){

for(int counter=0;counter<innerCounter;counter=counter +1){System.out.print(figure);}

innerCounter = innerCounter +1;

System.out.println(figure);
}

int innerinnerCounter = size-2;

for(int countest=1;countest<size;countest=countest +1){

for(int counter=0;counter<innerinnerCounter;counter=counter +1){System.out.print(figure);}

innerinnerCounter = innerinnerCounter -1;

System.out.println(figure);


}

}





}


