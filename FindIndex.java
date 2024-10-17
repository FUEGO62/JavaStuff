public class FindIndex{

    public static void main(String[] args){

	int [] arr = {3,4,1,-9,6};
	int sum = 10;
	int flag1 = 0;
	int flag2 = 0;
	boolean notFound = true;
	
	for(int count = 0; count < arr.length; count++){

		for(int counter = 0; counter < arr.length; counter++){

			if((arr[count]+arr[counter]) ==sum & count!=counter){flag2 = count;flag1 = counter;notFound = false;}

		}
	}

	if(notFound)System.out.println("Not found");
	else System.out.println(flag1 + " " +flag2);
	
    }

}