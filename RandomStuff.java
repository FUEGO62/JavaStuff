public class RandomStuff{

	public static void main(String[] args){


	int [][] board = new int[5][5];
	int move = mover(3,25);
	int row = 0;
	int col = 0;

	System.out.println(move);

	 if((move%board.length)!=0)row= move/board.length;
	        else row = (move/board.length)-1;
	        col = (move-1)%board.length;
		
		board[row][col] = 1;


	for(int count = 0; count < board.length;count++){
			
			for(int counter = 0 ; counter< board.length;counter++){

				if(board[count][counter]==0)System.out.print("0 ");
				else System.out.print("* ");	
			}

			System.out.println();
		}
	}

	public int move(int distance){

            if(face.equals("up") ){

		if(currentLocation - (5*distance)>0)
                	currentLocation -=(5*distance);

		else System.out.println("Out of bounds");
            }

	    if(face.equals("right")){

            	if((5-(currentLocation%5 + distance))>=0 & currentLocation%5!=0){

                currentLocation+=distance;
            }

	    	else System.out.println("Out of bounds");

	    }

            if(face.equals("down")){

		if(currentLocation + (5*distance) <= 25){
                	currentLocation+=(5*distance);

		}

		else System.out.println("Out of bounds");

            }

            if(face.equals("left")){

		if(currentLocation%5 - distance >=1||currentLocation%5==0 & distance<5)
                	currentLocation-=distance;

		else System.out.println("Out of bounds");

	
            }

	    return currentLocation;

	}

}