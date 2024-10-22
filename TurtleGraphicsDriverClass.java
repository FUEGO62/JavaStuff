public class TurtleGraphicsDriverClass{

    public static void main(String[] args){

	Board board = new Board();
	Turtle turtle = board.getTurtle();
	Pen pen = turtle.getPen();

	turtle.turnRight();
	turtle.turnRight();
	turtle.move(3);
	board.displayBoard();
	turtle.turnLeft();
	turtle.move(3);
	board.displayBoard();


    }

}