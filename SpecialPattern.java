

public class SpecialPattern{

public static void main(String[] args){

int decrementControl = 0;


int incrementControl = 0;

int firstHalfControl = 0;

int spaceMonitor = 45;


for(int count=1;count<6564;count*=3){

decrementControl = count;

incrementControl = 1;

firstHalfControl = decrementControl/3;

for(int space = 2;space < spaceMonitor ;space ++){

System.out.print(" ");


}



while(incrementControl<firstHalfControl){

if(incrementControl<27)System.out.printf("  %d  ",incrementControl);

if(incrementControl>=27 & incrementControl<243)System.out.printf("  %d ",incrementControl);

if(incrementControl>=243 & incrementControl!=729)System.out.printf(" %d ",incrementControl);

if(incrementControl==729)System.out.printf(" %d",incrementControl);


incrementControl*=3;
}




for(int counter = 0;counter<8;counter++){

if(decrementControl>1){

decrementControl/=3;

if(decrementControl<27)System.out.printf("  %d  ",decrementControl);

if(decrementControl>=27 & decrementControl<243)System.out.printf("  %d ",decrementControl);

if(decrementControl>=243)System.out.printf(" %d ",decrementControl);

}
}

spaceMonitor-=5;

System.out.println();

}

}

}

