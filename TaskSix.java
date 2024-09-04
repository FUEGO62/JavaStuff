public class TaskSix {

public static void main(String[] args){

int counter = 4;

int countest = 8;

for(int count=4;count<10;count+=4){

for(int control=0;control<5;control+=1){

if(count==4){System.out.printf("%d ",counter); counter= counter*count;}

else { System.out.printf("%d ",countest);
countest=countest*count;
}
}

}



}

}
