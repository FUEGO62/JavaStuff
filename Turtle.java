public class Turtle {

	private Pen pen = new Pen();
	private int position = 1;
	private int bearing = 0;
	private String face = "up";

	public Pen getPen(){

		return pen;
	}

	public int getPosition(){

		return position;
	}
	
	public void move(int distance){

            if(face.equals("up") ){

		if(position - (20*distance)>0)
                	position -=(20*distance);

		else System.out.println("Out of bounds");
            }

	    if(face.equals("right")){

            	if((20-(position%20 + distance))>=0 & position%20!=0){

                position+=distance;
            }

	    	else System.out.println("Out of bounds");

	    }

            if(face.equals("down")){

		if(position + (20*distance) <= 400){
                	position+=(20*distance);

		}

		else System.out.println("Out of bounds");

            }

            if(face.equals("left")){

		if(position%20 - distance >=1||position%20==0 & distance<20)
                	position-=distance;

		else System.out.println("Out of bounds");
            }

	}

	public void turnRight(){

		bearing++;
		setFace();
	}

	public void turnLeft(){

		bearing+=3;
		setFace();

	}

	public void setFace() {

        if((bearing%4)==0){face = "up";}
        if((bearing%4)==1){face = "right";}
        if((bearing%4)==2){face = "down";}
        if((bearing%4)==3){face = "left";}
    }

    public String getFace(){
        return face;
    }
}
