public class Pattern3{

    public static void main(String[] args){

	for(int count=0;count<6;count++){


		for(int patternACounter=0;patternACounter<(6-count);patternACounter++){

			System.out.print("*");
		}

		System.out.print(" ");

		for(int spaceCounter=0;spaceCounter<count;spaceCounter++){

			System.out.print(" ");
		}

		for(int patternBCounter=0;patternBCounter<=count;patternBCounter++){

			System.out.print("*");
		}

				


		System.out.println();




	}

    }

}