public class Pen{

	static Boolean isClicked = false;
	
	public static void click(){

		isClicked = true;

		System.out.println("Pen is down");

	}

	public static void unClick(){

		isClicked = false;
		
		System.out.println("Pen is up");
	}

	public static Boolean isPenClicked(){

		return isClicked;

	}

}