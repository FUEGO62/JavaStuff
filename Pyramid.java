import java.util.Scanner;

public class Pyramid {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("how many do you want: ");

int number = input.nextInt();

int innercounter = 1;

int innercountest = 0;

int monitor =30;


for(int count = 1;count<number+2;count++){



for(int spacing=0;spacing<monitor;spacing++){

System.out.print(" ");

}


for(int countest=innercountest;countest>1;countest--){

System.out.printf("%d ",countest);

}





for(int counter=1;counter<innercounter;counter++){

System.out.printf("%d ",counter);

}

innercountest++;

innercounter++;

monitor-=2;

System.out.println();

}



}

}