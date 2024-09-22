import java.security.SecureRandom;
public class PixelQuantization {

    public static void main(String [] args){

	SecureRandom randomNumber = new SecureRandom();

	int [] pixels = new int [10];

	int numberOfPixels = 200;

	float []value = new float[numberOfPixels];

	for(int count = 0; count < numberOfPixels;count ++ ){

		value[count] = randomNumber.nextInt(200);

	}

	for(int count = 0; count<numberOfPixels;count++){

		if(value[count]>=0 & value[count]<=20)pixels[0]++;
		if(value[count]>=21 & value[count]<=40)pixels[1]++;
		if(value[count]>=41 & value[count]<=60)pixels[2]++;
		if(value[count]>=61 & value[count]<=80)pixels[3]++;
		if(value[count]>=81 & value[count]<=100)pixels[4]++;
		if(value[count]>=101 & value[count]<=120)pixels[5]++;
		if(value[count]>=121 & value[count]<=140)pixels[6]++;
		if(value[count]>=141 & value[count]<=160)pixels[7]++;
		if(value[count]>=161 & value[count]<=180)pixels[8]++;
		if(value[count]>180) pixels[9]++;

	}

	
	for(int count = 0; count<pixels.length;count++){

		if(count==0)System.out.printf("%3d -%3d: ",(20*count),(20*count)+20);

		if(count >0 & count < 9)System.out.printf("%3d -%3d: ",(20*count)+1,(20*count)+20);
		
		if(count==9)System.out.printf("%8s: ","190");
		

		for(int counter = 0; counter<pixels[count];counter++){

			System.out.print("=");
		
		}

		System.out.println();

	}




    }

}