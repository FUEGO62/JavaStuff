public class TaskEight {

public static void main(String[] args){

int counter = 4;

int countest = 8;

int totalcounter=0;

int totalcountest =0;
 

for(int count=4;count<10;count+=4){

for(int control=0;control<5;control+=1){

if(count==4){totalcounter=totalcounter+counter ; counter= counter*count;}

else {totalcountest=totalcountest+countest;
countest=countest*count;
}
}

}
int sum = totalcounter + totalcountest;

System.out.print(sum);


}

}
