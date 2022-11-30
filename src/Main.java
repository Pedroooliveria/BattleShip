public class Main {
    public static void main(String[] args) {
        Board board = new Board();


        board.check();
        Board.printBoard(board.playerBoard, board.tacticalBoard);
        board.setBoats();
    }
}