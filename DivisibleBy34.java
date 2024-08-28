public class DivisibleBy34{

public static void main(String[]args){

int counter=0;

for(int count = 100;count<1000;count=count+1){

int remainder1 =count%3;

int remainder2 =count%4;

if(remainder1 ==0 & remainder2==0){System.out.printf(" %d ",count);

counter=counter +1;

int listnum = counter%10;

if(listnum ==0){System.out.printf("%n");}


}

}












}

}