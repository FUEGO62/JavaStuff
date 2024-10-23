import java.util.Scanner;
public class StudentGrade{

    public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	
	float score = 0;
	float total = 0;
	float largest = 0;
	float smallest = 0;
	int bigFlag = 0;
	int smallFlag = 0;
	float average = 0;
	
	System.out.print("How many students do you have :");

	int students = input.nextInt();

	System.out.print("How many subjects do they offer :");

	int subjects = input.nextInt();

	System.out.println();

	float[][] gradebook = new float[students][subjects+3];
	int[] passCount = new int[subjects];
	int[] failCount = new int[subjects];
	float[] positions = new float[students];

	for(int count = 0; count<gradebook.length;count++){

		for(int counter = 0; counter<gradebook[count].length-3;counter++){

			System.out.printf("Entering score for student %d%n",count+1);
			System.out.printf("Enter score for subject %d%n",counter+1);
			score = input.nextFloat();
			if(score>=0 & score<=100){
				
				gradebook[count][counter]=score;

				gradebook[count][gradebook[count].length-3]+=score;
				System.out.printf("Saving >>>>>>>>>>>>>>>>>%n%nSaved successfully%n%n");

			}
			else {

				counter-=1;

				System.out.println("Whoops!, looks like you made an error here , please re-enter score");

			}
						
		}

		gradebook[count][gradebook[count].length-2]=gradebook[count][gradebook[count].length-3]/subjects;

		gradebook[count][gradebook[count].length-1]=1;
	
	}

	for(int count = 0; count < positions.length; count++ ){
	
		for(int counter = 0; counter< positions.length;counter++){

			if(gradebook[count][gradebook[count].length-3]<gradebook[counter][gradebook[counter].length-3])gradebook[count][gradebook[count].length-1]++;

		}

	}

	for(int count = 0; count<gradebook.length;count++){

		System.out.printf("Student %d    ",count+1);

		for(int counter = 0; counter<gradebook[count].length;counter++){

			System.out.printf("%.0f   ",gradebook[count][counter]);
		}

		System.out.println();
	}

	for(int count = 0; count<subjects;count++){

		largest = 0;
		smallest = 101;
		total = 0;

		for(int counter = 0; counter<students;counter++){

			if(gradebook[counter][count]>=50)passCount[count]++;
			else failCount[count]++;

			total += gradebook[counter][count];
			
			if(gradebook[counter][count]>largest){largest = gradebook[counter][count];bigFlag = counter;}

			if(gradebook[counter][count]<smallest){smallest = gradebook[counter][count];smallFlag = counter;}
			
		}

		average = total/students;

		System.out.printf("%nSUBJECT SUMMARY%n%nSubject %d%n%n Highest scoring student is: Student %d scoring %.0f%n%nLowest scoring student is: student %d scoring %.2f%n%nTotal Score is: %.2f%n%nAverage score is: %.2f%n%nNumber of passes: %d%n%nNumber of fails: %d%n%n",count+1,bigFlag+1,gradebook[bigFlag][count],smallFlag+1,gradebook[smallFlag][count],total,average,passCount[count],failCount[count]);

	}

	largest = 0;
	smallest = 101;

	for(int count = 0; count< passCount.length;count++){

		if(passCount[count]>largest){largest=passCount[count];bigFlag = count;}
		if(failCount[count]>smallest){smallest=failCount[count];smallFlag = count;}		
	}

	largest = 0;
	smallest = 101;
	int bigFlag2 = 0;
	int smallFlag2 = 0;

	System.out.printf("The hardest subject is Subject %d with %d failures%n%n",smallFlag+1,failCount[smallFlag]);

	System.out.printf("The easiest subject is Subject %d with %d passes%n%n",bigFlag+1,passCount[bigFlag]);
	
	for(int count = 0; count<gradebook.length;count++){

		for(int counter = 0; counter<gradebook[count].length-3;counter++){

			if(gradebook[count][counter]>largest){largest=gradebook[count][counter];bigFlag=count;bigFlag2=counter;}
			if(gradebook[count][counter]<smallest){smallest=gradebook[count][counter];smallFlag=count;smallFlag2=counter;

			}

		}

	}

	System.out.printf("The overall Highest score is scored by Student %d in subject %d scoring %.0f%n%n",bigFlag+1,bigFlag2+1,gradebook[bigFlag][bigFlag2]);	

	System.out.printf("The overall Lowest score is scored by Student %d in subject %d scoring %.0f%n",smallFlag+1,smallFlag2+1,gradebook[smallFlag][smallFlag2]);	

	largest = 0;
	smallest = 101;
	total = 0;

	

    }

}