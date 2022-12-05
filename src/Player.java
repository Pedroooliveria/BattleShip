import Boats.*;

import java.util.Scanner;

public class Player {
    Board board = new Board();
    private int count = 0;


    public void addBoats(Ship ship, String[][] player) {
        int row;
        int col;
        String direction;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Cols:");
            col = board.letterToNumber(scanner.next());
            System.out.print("Enter Row: ");
            row = scanner.nextInt() - 1;
            System.out.print("Enter direction(H/V): ");
            direction = scanner.next();
            if (direction.equals("H".toUpperCase()) || direction.equals("h".toLowerCase())) {
                for (int j = 0; j < ship.getSize(); j++) {
                    player[row][col + j] = ship.getSymbol();
                }
                Board.boardPlayer(player);
                break;
            }
            if (direction.equals("V".toUpperCase())) {
                for (int i = 0; i < ship.getSize(); i++) {
                    player[i + row][col] = ship.getSymbol();
                }
                Board.boardPlayer(player);
                break;
            }
        }
    }

    public void setBoats(String[][] player) {
        Ship destroyer = new Destroyer();
        Ship submarine = new Submarine();
        Ship cruiser = new Cruiser();
        Ship battleShip = new BattleShip();
        Ship carrier = new Carrier();

        addBoats(destroyer, player);
        addBoats(submarine, player);
        addBoats(cruiser, player);
        addBoats(battleShip, player);
        addBoats(carrier, player);
        Board.boardPlayer(player);
    }


    public void attack(String[][] player, String[][] tactical) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        String fire = "🔥";
        String water = "💧";
        while (count <= 17) {
            System.out.print("Enter Cols: ");
            col = board.letterToNumber(scanner.next());
            System.out.print("Enter Row: ");
            row = scanner.nextInt() - 1;
            if (!player[row][col].equals("  ")) {
                tactical[row][col] = fire;
                Board.taticalBord(tactical);
                count++;
                break;
            }
            if (player[row][col].equals("  ")) {
                tactical[row][col] = water;
                Board.taticalBord(tactical);
                break;
            }
            if (count == 17) {
                System.out.println(player + " WIN!");
            }
        }


    }
}



