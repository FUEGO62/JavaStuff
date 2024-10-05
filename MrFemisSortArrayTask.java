public class MrFemisSortArrayTask {

   public static void main(String[] args) {

        int[] numbers = {16,5, 2, 8, 7, 23, 1};

	for(int count = 0 ;count< numbers.length; count++){
	
		for(int counter = 0; counter<numbers.length-1; counter++){

			if(numbers[counter]>numbers[counter+1]){

				numbers[counter+1]= numbers[counter] + numbers[counter+1];
				numbers[counter] = numbers[counter+1]- numbers[counter];
				numbers[counter+1] = numbers[counter+1] - numbers[counter];
		
			}
	
		}

		
	}


	for(int count = 0; count < numbers.length; count++){

		System.out.print(numbers[count]+" ");

	}


    }

}