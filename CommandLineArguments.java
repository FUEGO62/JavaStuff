public class CommandLineArguments {

    public static void main(String [] args){

	int largest = 0;

	int smallest = 0;	

	int [] sizechecker = new int [args.length];

	if(args.length==3){
	
		sizechecker[0] = Integer.parseInt(args[0]);
		sizechecker[1] = Integer.parseInt(args[1]);
		sizechecker[2] = Integer.parseInt(args[2]);

		largest=sizechecker[0];
		smallest=sizechecker[0];

		for(int count = 0; count< args.length; count++){
			
			if(largest<sizechecker[count])largest=sizechecker[count];
			
			if(sizechecker[count]<smallest)smallest=sizechecker[count];
		}

		System.out.printf("The largest is %d and the smallest is %d",largest,smallest);
	}

	else {System.out.println("Enter three arguments");}

    }
}