import Boats.*;

import java.util.Scanner;

public class Board {

    String[][] playerBoard = new String[10][10];
    String[][] tacticalBoard = new String[10][10];

    public void check() {
        for (int i = 0; i < playerBoard.length; i++) {
            for (int j = 0; j < playerBoard[i].length; j++) {
                playerBoard[i][j] = "  ";
            }
        }
        for (int i = 0; i < tacticalBoard.length; i++) {
            for (int j = 0; j < tacticalBoard[i].length; j++) {
                tacticalBoard[i][j] = "  ";
            }
        }
    }

    public static void printBoard(String[][] playerBoard, String[][] tacticalBoard) {

        System.out.println();
        System.out.println("      A    B    C    D    E    F    G    H    I    J");
        System.out.println("    |----|----|----|----|----|----|----|----|----|----|");
        System.out.println("  1 | " + playerBoard[0][0] + " | " + playerBoard[0][1] + " | " + playerBoard[0][2] + " | " + playerBoard[0][3] + " | " + playerBoard[0][4] + " | " + playerBoard[0][5] + " | " + playerBoard[0][6] + " | " + playerBoard[0][7] + " | " + playerBoard[0][8] + " | " + playerBoard[0][9] + " |");
        System.out.println("    |----|----|----|----|----|----|----|----|----|----|");
        System.out.println("  2 | " + playerBoard[1][0] + " | " + playerBoard[1][1] + " | " + playerBoard[1][2] + " | " + playerBoard[1][3] + " | " + playerBoard[1][4] + " | " + playerBoard[1][5] + " | " + playerBoard[1][6] + " | " + playerBoard[1][7] + " | " + playerBoard[1][8] + " | " + playerBoard[1][9] + " |");
        System.out.println("    |----|----|----|----|----|----|----|----|----|----|");
        System.out.println("  3 | " + playerBoard[2][0] + " | " + playerBoard[2][1] + " | " + playerBoard[2][2] + " | " + playerBoard[2][3] + " | " + playerBoard[2][4] + " | " + playerBoard[2][5] + " | " + playerBoard[2][6] + " | " + playerBoard[2][7] + " | " + playerBoard[2][8] + " | " + playerBoard[2][9] + " |");
        System.out.println("    |----|----|----|----|----|----|----|----|----|----| ");
        System.out.println("  4 | " + playerBoard[3][0] + " | " + playerBoard[3][1] + " | " + playerBoard[3][2] + " | " + playerBoard[3][3] + " | " + playerBoard[3][4] + " | " + playerBoard[3][5] + " | " + playerBoard[3][6] + " | " + playerBoard[3][7] + " | " + playerBoard[3][8] + " | " + playerBoard[3][9] + " |");
        System.out.println("    |----|----|----|----|----|----|----|----|----|----|");
        System.out.println("  5 | " + playerBoard[4][0] + " | " + playerBoard[4][1] + " | " + playerBoard[4][2] + " | " + playerBoard[4][3] + " | " + playerBoard[4][4] + " | " + playerBoard[4][5] + " | " + playerBoard[4][6] + " | " + playerBoard[4][7] + " | " + playerBoard[4][8] + " | " + playerBoard[4][9] + " |");
        System.out.println("    |----|----|----|----|----|----|----|----|----|----| ");
        System.out.println("  6 | " + playerBoard[5][0] + " | " + playerBoard[5][1] + " | " + playerBoard[5][2] + " | " + playerBoard[5][3] + " | " + playerBoard[5][4] + " | " + playerBoard[5][5] + " | " + playerBoard[5][6] + " | " + playerBoard[5][7] + " | " + playerBoard[5][8] + " | " + playerBoard[5][9] + " |");
        System.out.println("    |----|----|----|----|----|----|----|----|----|----|");
        System.out.println("  7 | " + playerBoard[6][0] + " | " + playerBoard[6][1] + " | " + playerBoard[6][2] + " | " + playerBoard[6][3] + " | " + playerBoard[6][4] + " | " + playerBoard[6][5] + " | " + playerBoard[6][6] + " | " + playerBoard[6][7] + " | " + playerBoard[6][8] + " | " + playerBoard[6][9] + " |");
        System.out.println("    |----|----|----|----|----|----|----|----|----|----|");
        System.out.println("  8 | " + playerBoard[7][0] + " | " + playerBoard[7][1] + " | " + playerBoard[7][2] + " | " + playerBoard[7][3] + " | " + playerBoard[7][4] + " | " + playerBoard[7][5] + " | " + playerBoard[7][6] + " | " + playerBoard[7][7] + " | " + playerBoard[7][8] + " | " + playerBoard[7][9] + " |");
        System.out.println("    |----|----|----|----|----|----|----|----|----|----|");
        System.out.println("  9 | " + playerBoard[8][0] + " | " + playerBoard[8][1] + " | " + playerBoard[8][2] + " | " + playerBoard[8][3] + " | " + playerBoard[8][4] + " | " + playerBoard[8][5] + " | " + playerBoard[8][6] + " | " + playerBoard[8][7] + " | " + playerBoard[8][8] + " | " + playerBoard[8][9] + " |");
        System.out.println("    |----|----|----|----|----|----|----|----|----|----|");
        System.out.println(" 10 | " + playerBoard[9][0] + " | " + playerBoard[9][1] + " | " + playerBoard[9][2] + " | " + playerBoard[9][3] + " | " + playerBoard[9][4] + " | " + playerBoard[9][5] + " | " + playerBoard[9][6] + " | " + playerBoard[9][7] + " | " + playerBoard[9][8] + " | " + playerBoard[9][9] + " |");
        System.out.println("    |----|----|----|----|----|----|----|----|----|----|");
        System.out.println();
    }

    public int letterToNumber(String letter) {

        switch (letter) {
            case "A":
                return 0;
            case "B":
                return 1;
            case "C":
                return 2;
            case "D":
                return 3;
            case "E":
                return 4;
            case "F":
                return 5;
            case "G":
                return 6;
            case "H":
                return 7;
            case "I":
                return 8;
            case "J":
                return 9;
        }
        return 0;
    }

    public void addBoats(Ship ship) {
        int col;
        int row;
        String direction;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Cols:");
            col = letterToNumber(scanner.next());
            System.out.print("Enter Row: ");
            row = scanner.nextInt() - 1;
            System.out.println("Chose your direction: ");
            direction = scanner.next();
            if (playerBoard == null) {
                if (direction.equals("h".toUpperCase())) {
                    for (int j = 0; j < ship.getSize(); j++) {
                        playerBoard[row][j + col] = ship.getSymbole();
                    }
                    printBoard(playerBoard, tacticalBoard);
                    break;
                }
                if (direction.equals("v".toUpperCase())) {
                    for (int i = 0; i < ship.getSize(); i++) {
                        playerBoard[i + row][col] = ship.getSymbole();
                    }
                    printBoard(playerBoard, tacticalBoard);
                    break;
                }
            }
            if (playerBoard!=null){
                System.out.println("Choose other position!");
            }


        }
    }

    public void setBoats() {
        Ship destroyer = new Destroyer();
        Ship submarine = new Submarine();
        Ship cruiser = new Cruiser();
        Ship battleShip = new BattleShip();
        Ship carrier = new Carrier();

        addBoats(destroyer);
        addBoats(submarine);
        addBoats(cruiser);
        addBoats(battleShip);
        addBoats(carrier);
        printBoard(playerBoard, tacticalBoard);

    }

}