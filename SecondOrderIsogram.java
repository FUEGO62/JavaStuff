public class SecondOrderIsogram{

    public static void main(String [] args){

	String text = "jesse";
	String uniqueCharacters = "";

	for(int count = 0; count < text.length( ); count ++){

		char currentCharacter = text.charAt(count);
		if(!uniqueCharacters.contains(currentCharacter + "")){

			uniqueCharacters += currentCharacter;
		}
	}

	int [] tally = new int [uniqueCharacters.length()];
	
	for(int count = 0; count < uniqueCharacters.length(); count ++ ){

		for(int counter = 0; counter < text.length(); counter++){

			if(uniqueCharacters.charAt(count)==text.charAt(counter)){

				tally[count]++;
			}
		}
	}

	boolean isIsogram = true;

	for(int count = 0; count < tally.length; count ++){

		if(tally[count]!=2)isIsogram= false;
	}
	
	System.out.print(isIsogram);

    }
}