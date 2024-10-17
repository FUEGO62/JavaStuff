import java.util.Arrays;
public class TitleCase{

    public static void main(String [] args){

	String sentence = "it is good to get at least nine hours of sleep";
	String [] token = sentence.split(" ");

	for(int count = 0; count < token.length; count++){
		String word =token[count];
		char letter = Character.toUpperCase(word.charAt(0));
		token[count] = word.replaceFirst(word.charAt(0)+"", letter+"");		
	}

	System.out.print(Arrays.toString(token));

    }

}