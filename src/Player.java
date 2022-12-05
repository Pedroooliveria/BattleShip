import Boats.*;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Player {
    Board board = new Board();

    String[][] player1 = new String[10][10];
    String[][] tactical1 = new String[10][10];
    String[][] player2 = new String[10][10];
    String[][] tactical2 = new String[10][10];


    public void check() {
        for (String[] element : player1) {
            Arrays.fill(element, "  ");
        }
        for (String[] item : tactical1) {
            Arrays.fill(item, "  ");
        }
        for (String[] value : player2) {
            Arrays.fill(value, "  ");
        }
        for (String[] strings : tactical2) {
            Arrays.fill(strings, "  ");
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
            System.out.print("Enter direction(H/V): ");
            direction = scanner.next();
            if (direction.equals("H".toUpperCase()) || direction.equals("h".toLowerCase())) {
                for (int j = 0; j < ship.getSize(); j++) {
                    player1[row][col + j] = ship.getSymbol();
                }
                Board.boardPlayer1(player1);
                break;
            }
            if (direction.equals("V".toUpperCase())) {
                for (int i = 0; i < ship.getSize(); i++) {
                    player1[i + row][col] = ship.getSymbol();
                }
                Board.boardPlayer1(player1);
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
        Board.boardPlayer1(player1);
    }

    public void addBoats2(Ship ship) {
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
                    player2[row][j + col] = ship.getSymbol();
                }
                Board.boardPlayer2(player2);
                break;
            }
            if (direction.equals("V".toUpperCase())) {
                for (int i = 0; i < ship.getSize(); i++) {
                    player2[i + row][col] = ship.getSymbol();
                }
                Board.boardPlayer2(player2);
                break;
            }
        }
    }

    public void setBoats2() {
        Ship destroyer = new Destroyer();
        Ship submarine = new Submarine();
        Ship cruiser = new Cruiser();
        Ship battleShip = new BattleShip();
        Ship carrier = new Carrier();

        addBoats2(destroyer);
        addBoats2(submarine);
        addBoats2(cruiser);
        addBoats2(battleShip);
        addBoats2(carrier);
        Board.boardPlayer2(player2);

    }


    public void attack() {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        String fire = "🔥";
        String water = "💧";
        int count = 0;
        int count2 = 0;


        while (count <= 17 || count2 <= 17) {
            System.out.println("Player One:");
            System.out.print("Enter Cols:");
            col = board.letterToNumber(scanner.next());
            System.out.print("Enter Row: ");
            row = scanner.nextInt() - 1;
            if (!player2[row][col].equals("  ")) {
                tactical1[row][col] = fire;
                Board.taticalBord1(tactical1);
                count++;
            }
            if (player2[row][col].equals("  ")) {
                tactical2[row][col] = water;
                Board.taticalBord1(tactical1);
            }
           System.out.println("Player two: ");
            System.out.print("Enter Cols:");
            col = board.letterToNumber(scanner.next());
            System.out.print("Enter Row: ");
            row = scanner.nextInt() - 1;
            if (!player1[row][col].equals("  ")) {
                tactical2[row][col] = fire;
                Board.taticalBord2(tactical2);
                count2++;
            }
            if (player1[row][col].equals("  ")) {
                tactical2[row][col] = water;
                Board.taticalBord2(tactical2);
            }
        }
    }
}


