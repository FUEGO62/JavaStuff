
public class SpecialPattern{

public static void main(String[] args){

String figure = "*";

int innerCounter = 0;

for(int count=0;count<6;count=count +1){

for(int counter=0;counter<innerCounter;counter=counter +1){System.out.print(figure);}

innerCounter = innerCounter +1;

System.out.println(figure);
}

int innerinnerCounter = 4;

for(int countest=1;countest<6;countest=countest +1){

for(int counter=0;counter<innerinnerCounter;counter=counter +1){System.out.print(figure);}

innerinnerCounter = innerinnerCounter -1;

System.out.println(figure);






}

}



}


