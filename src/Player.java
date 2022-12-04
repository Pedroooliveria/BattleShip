import Boats.*;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    Board board = new Board();

    String[][] player1 = new String[10][10];
    String[][] tactical1 = new String[10][10];


    public void check() {
        for (int i = 0; i < player1.length; i++) {
            Arrays.fill(player1[i], "  ");
        }
        for (int i = 0; i < tactical1.length; i++) {
            Arrays.fill(tactical1[i], "  ");
        }
    }

    public void addBoats1(Ship ship) {
        int row;
        int col;
        String direction;
        Scanner scanner = new Scanner(System.in);
        while (true) {


            System.out.print("Enter Cols:");
            col = board.letterToNumber(scanner.next());
            System.out.print("Enter Row: ");
            row = scanner.nextInt() - 1;
            System.out.print("Chose your direction: ");
            direction = scanner.next();
            if (direction.equals("H".toUpperCase())) {
                for (int j = 0; j < ship.getSize(); j++) {
                    player1[row][j + col] = ship.getSymbole();
                }
                Board.boardPlayer1(player1, tactical1);
                break;
            }
            if (direction.equals("V".toUpperCase())) {
                for (int i = 0; i < ship.getSize(); i++) {
                    player1[i + row][col] = ship.getSymbole();
                }
                Board.boardPlayer1(player1, tactical1);
                break;
            }
        }
    }

    public void setBoats1() {
        Ship destroyer = new Destroyer();
        Ship submarine = new Submarine();
        Ship cruiser = new Cruiser();
        Ship battleShip = new BattleShip();
        Ship carrier = new Carrier();

        addBoats1(destroyer);
        addBoats1(submarine);
        addBoats1(cruiser);
        addBoats1(battleShip);
        addBoats1(carrier);
        board.boardPlayer1(player1, tactical1);

    }
}
