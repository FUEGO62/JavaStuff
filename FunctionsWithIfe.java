import java.util.Arrays;
public class FunctionsWithIfe{

    public static void main(String [] args){

	int [] ife = new int [15];

		double rowEquivalent = 0;
	
	for(int move = 1; move < 9; move++){
	
		rowEquivalent = (0.0265*Math.pow(move,4)- 0.4773*Math.pow(move,3)+ 2.549*Math.pow(move,2) - 3.6136*move -0.5);

	System.out.println((int)Math.round(rowEquivalent));
	
	}

    }

}