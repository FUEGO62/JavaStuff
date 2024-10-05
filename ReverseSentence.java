import java.util.Arrays;
public class ReverseSentence{

    public static void main(String[] args){


	String sentence = "hello my name is jesse";

	System.out.print(Arrays.toString(reverseSentence(sentence)));

    }


    public static String[] reverseSentence(String sentence){

	int wordCount = 1;
	int count = 0;
	
	for(int counter = 0; counter < sentence.length(); counter++){

		if(sentence.charAt(counter)==' ')wordCount++;

	}

	String [] words = new String[wordCount];

	for(int counter = 0; counter <words.length; counter++){

		words[counter] = "";

	}

	for(count = 0; count<words.length;count++){


		for(int counter = 0; counter<sentence.length();counter++){

			words[(words.length-1)-count] += sentence.charAt(counter);
			if(sentence.charAt(counter) ==' ')count++;
			
			
		}

	}

	return words;

	
    }

}