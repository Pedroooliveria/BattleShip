public class Main {
    public static void main(String[] args) {

        Player newPlayer1 = new Player();
        Player newPlayer2 = new Player();


        System.out.println("First player: ");
        newPlayer1.check();
        Board.boardPlayer1(newPlayer1.player1);
        newPlayer1.setBoats1();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        newPlayer2.check();
        System.out.println("Second player: ");
        Board.boardPlayer2(newPlayer2.player2);
        newPlayer2.setBoats2();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        newPlayer1.attack();




    }
}