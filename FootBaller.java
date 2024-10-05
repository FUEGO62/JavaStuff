public class FootBaller{

    public static void main(String[] args){


	Leg fuego = new Leg();
	Ball jesse = new Ball();
	Field dera = new Field();

	int force = 4;

	fuego.kick(force);
	jesse.getPosition();
	dera.displayArray();

	System.out.println(fuego.getForce());

	System.out.println(jesse.getPos());

    }

}