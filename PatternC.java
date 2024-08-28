public class PatternC{

public static void main(String[] args){

String figure = "*";

String space = " ";

int innerCounter = 5;

int otherInnerCounter =0;

for(int count=0;count<6;count=count +1){

for(int counter=0;counter<innerCounter;counter=counter +1){System.out.print(space);}

innerCounter = innerCounter -1;

for(int countest=0;countest<otherInnerCounter;countest=countest +1){System.out.print(figure);}

otherInnerCounter = otherInnerCounter +1;


System.out.println(figure);




}

}

}