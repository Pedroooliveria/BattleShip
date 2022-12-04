public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Player player1 = new Player();
        Player player2 = new Player();


        System.out.println("First player: ");
        player1.check();
        Board.boardPlayer1(player1.player1, player1.tactical1);
        player1.setBoats1();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Second player: ");
        board.check2();
        Board.boardPlayer2(board.player2, board.tactical2);
        board.setBoats2();


    }
}