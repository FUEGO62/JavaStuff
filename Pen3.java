public class Pen3{

	private Boolean isClicked = false;
	
	public void click(){

		this.isClicked = true;

		System.out.println("Pen is down");

	}

	public void unClick(){

		this.isClicked = false;
		
		System.out.println("Pen is up");
	}

	public Boolean isPenClicked(){

		return this.isClicked;

	}

}