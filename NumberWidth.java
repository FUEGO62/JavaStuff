public class NumberWidth  {

    public static void main(String[]args){
	
	System.out.print(format(34,4));
	
    }

    public static String format (int number , int width){

	String stringNumber = Integer.toString(number);

	String formattedNumber = "";

	int length = stringNumber.length();

	int zeroCount = width - length;

	if(zeroCount > 0){

		for(int count = 0; count < zeroCount ; count++){

			formattedNumber+= "0";

		}


		
	}


	formattedNumber += stringNumber;

	return formattedNumber;


    }

}