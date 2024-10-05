public class FunctionPracticeMain{

    private int move;

    public void setMove(int move){

	this.move = move;


    }

    public int [][] showPosition(int [][] arr){

	int row = 0;
	int column = 0;

	if((move%arr.length)!=0)row = move/arr.length;
	else row = (move/arr.length)-1;

	column = (move-1)%arr.length;

	arr[row][column] = 1  ;

	return arr;


    }

    public void displayArray(int [][] array){

	for(int counter =0; counter< array.length; counter++){

		for(int count = 0; count < array.length; count++){

			System.out.print(array[counter][count]+" ");

		}

		System.out.println();

    	}

}
    

}

