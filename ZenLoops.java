public class ZenLoops{
    
    public static void main(String[] args){

	int spacecontrol = 0;

	for(int count = 1; count < 19683 ; count*=3){

		for(int counter = 40; counter> spacecontrol; counter--){

			System.out.print(" ");

		}		

		for(int counter = 1; counter<count/3;){

			System.out.printf("%5d",counter);

			counter*=3;
		
		}

		for(int counter = count; counter>1;){

			counter/=3;

			System.out.printf("%5d",counter);
		
		}

		System.out.println();
		spacecontrol+=5;

	}

	System.out.println();
	
	String sum = "";
	String summer = "";
	String sumin = "";
	String suminer = "";

	for(int count = 0; count < 10; count ++){

		for(int counter = 0; counter<= count ; counter ++){
	
			sum += "x";
			sumin += "o";

		
		}

		for(int counter = 0; counter<(10- count) ; counter ++){
	
			summer += "<>";
			suminer += "..";
		}

		System.out.print(sum+" "+summer+" "+sumin+" "+sum+" "+suminer+" " + sumin+" ");

		System.out.println(sum+" "+summer+" ");

		sum = "";
		summer = "";
		sumin = "";
		suminer = "";
	}


    }

}