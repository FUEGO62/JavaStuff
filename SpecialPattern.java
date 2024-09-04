

public class SpecialPattern{

public static void main(String[] args){

int combat = 0;

int combat2 = 0;

int control = 0;

int combat3 = 0;

int monitor = 45;


for(int count=1;count<6564;count*=3){

combat = count;

combat2 = count;

control = 1;

combat3 = combat/3;

for(int countings = 2;countings<monitor;countings++){

System.out.print(" ");


}



while(control<combat3){

if(control<27)System.out.printf("  %d  ",control);

if(control>=27 & control<243)System.out.printf("  %d ",control);

if(control>=243 & control!=729)System.out.printf(" %d ",control);

if(control==729)System.out.printf(" %d",control);


control*=3;
}




for(int counter = 0;counter<8;counter++){

if(combat>1){

combat/=3;

if(combat<27)System.out.printf("  %d  ",combat);

if(combat>=27 & combat<243)System.out.printf("  %d ",combat);

if(combat>=243)System.out.printf(" %d ",combat);

}
}

monitor-=5;

System.out.println();

}

}

}

