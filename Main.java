import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        BoardMap map = new BoardMap();
        Shape shape = new Shape(5);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String move = "";
        int row;
        int col ;
        int lineClearer;
        boolean continueGame = true;
        int loopTracker = 0;

        String downTriangle = shape.drawDownTriangle();
        String upTriangle = shape.drawUpTriangle();
        String square = shape.drawSquare();

        int randomNum = random.nextInt(3);

        String [][] board = new String[5][5];
        board = map.initialize(board);
        char [] shapes = {'s','u','d'};
        String [] blocks = {square,upTriangle,downTriangle};

        while (continueGame) {
            loopTracker++;
            col = 2;
            row = 0;
            randomNum = random.nextInt(3);

            if(loopTracker<2 && randomNum == 2){
                randomNum = random.nextInt(2);
            }

            System.out.println(blocks[randomNum]);
            System.out.println("You are at space " + (col+1));
            System.out.println("press L for left ,press R for right press D to drop");

            move = scanner.nextLine().toUpperCase();

            while (!move.equals("D")) {

                if (move.equals("L") & col > 0) {
                    col--;
                    System.out.println("moved left one space you are at space " + (col + 1));
                } else if (move.equals("R") & col < 4) {
                    col++;
                    System.out.println("moved right one space you are at space " + (col+1));
                } else System.out.println("Invalid");

                move = scanner.nextLine().toUpperCase();
            }
            board = Board.addGravityEffect(board);
            board = Board.setBlock(board,col,randomNum,map);
            board = Board.mergeTriangles(board,col,map);
            board = Board.clearLine(board,map);
            board = Board.mapBoard(board,map);

            continueGame = Board.isGameOver(board);

            map.display();
        }
    }

}