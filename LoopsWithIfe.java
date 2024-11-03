import java.util.Scanner;
public class LoopsWithIfe{

    public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	String str = "aaaaaaaaa";
	String str2 = "";

	for(int count= 0; count < 8; count++){

		str = str.replaceFirst("a","");
		str2 += " ";
		System.out.print(str);
		System.out.println(str2);

	}
	

    }

}