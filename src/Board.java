public class Board {


    public int letterToNumber(String letter) {

        return switch (letter) {
            case "A" -> 0;
            case "B" -> 1;
            case "C" -> 2;
            case "D" -> 3;
            case "E" -> 4;
            case "F" -> 5;
            case "G" -> 6;
            case "H" -> 7;
            case "I" -> 8;
            case "J" -> 9;
            default -> 0;
        };
    }

    public static void boardPlayer1(String[][] playerBoard1) {
        System.out.println();
        System.out.print("      A    B    C    D    E    F    G    H    I    J \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----|\n");
        System.out.print("  1 | " + playerBoard1[0][0] + " | " + playerBoard1[0][1] + " | " + playerBoard1[0][2] + " | " + playerBoard1[0][3] + " | " + playerBoard1[0][4] + " | " + playerBoard1[0][5] + " | " + playerBoard1[0][6] + " | " + playerBoard1[0][7] + " | " + playerBoard1[0][8] + " | " + playerBoard1[0][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  2 | " + playerBoard1[1][0] + " | " + playerBoard1[1][1] + " | " + playerBoard1[1][2] + " | " + playerBoard1[1][3] + " | " + playerBoard1[1][4] + " | " + playerBoard1[1][5] + " | " + playerBoard1[1][6] + " | " + playerBoard1[1][7] + " | " + playerBoard1[1][8] + " | " + playerBoard1[1][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  3 | " + playerBoard1[2][0] + " | " + playerBoard1[2][1] + " | " + playerBoard1[2][2] + " | " + playerBoard1[2][3] + " | " + playerBoard1[2][4] + " | " + playerBoard1[2][5] + " | " + playerBoard1[2][6] + " | " + playerBoard1[2][7] + " | " + playerBoard1[2][8] + " | " + playerBoard1[2][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  4 | " + playerBoard1[3][0] + " | " + playerBoard1[3][1] + " | " + playerBoard1[3][2] + " | " + playerBoard1[3][3] + " | " + playerBoard1[3][4] + " | " + playerBoard1[3][5] + " | " + playerBoard1[3][6] + " | " + playerBoard1[3][7] + " | " + playerBoard1[3][8] + " | " + playerBoard1[3][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  5 | " + playerBoard1[4][0] + " | " + playerBoard1[4][1] + " | " + playerBoard1[4][2] + " | " + playerBoard1[4][3] + " | " + playerBoard1[4][4] + " | " + playerBoard1[4][5] + " | " + playerBoard1[4][6] + " | " + playerBoard1[4][7] + " | " + playerBoard1[4][8] + " | " + playerBoard1[4][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  6 | " + playerBoard1[5][0] + " | " + playerBoard1[5][1] + " | " + playerBoard1[5][2] + " | " + playerBoard1[5][3] + " | " + playerBoard1[5][4] + " | " + playerBoard1[5][5] + " | " + playerBoard1[5][6] + " | " + playerBoard1[5][7] + " | " + playerBoard1[5][8] + " | " + playerBoard1[5][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  7 | " + playerBoard1[6][0] + " | " + playerBoard1[6][1] + " | " + playerBoard1[6][2] + " | " + playerBoard1[6][3] + " | " + playerBoard1[6][4] + " | " + playerBoard1[6][5] + " | " + playerBoard1[6][6] + " | " + playerBoard1[6][7] + " | " + playerBoard1[6][8] + " | " + playerBoard1[6][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  8 | " + playerBoard1[7][0] + " | " + playerBoard1[7][1] + " | " + playerBoard1[7][2] + " | " + playerBoard1[7][3] + " | " + playerBoard1[7][4] + " | " + playerBoard1[7][5] + " | " + playerBoard1[7][6] + " | " + playerBoard1[7][7] + " | " + playerBoard1[7][8] + " | " + playerBoard1[7][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  9 | " + playerBoard1[8][0] + " | " + playerBoard1[8][1] + " | " + playerBoard1[8][2] + " | " + playerBoard1[8][3] + " | " + playerBoard1[8][4] + " | " + playerBoard1[8][5] + " | " + playerBoard1[8][6] + " | " + playerBoard1[8][7] + " | " + playerBoard1[8][8] + " | " + playerBoard1[8][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print(" 10 | " + playerBoard1[9][0] + " | " + playerBoard1[9][1] + " | " + playerBoard1[9][2] + " | " + playerBoard1[9][3] + " | " + playerBoard1[9][4] + " | " + playerBoard1[9][5] + " | " + playerBoard1[9][6] + " | " + playerBoard1[9][7] + " | " + playerBoard1[9][8] + " | " + playerBoard1[9][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.println();
    }

    public static void boardPlayer2(String[][] playerBoard2) {
        System.out.println();
        System.out.print("      A    B    C    D    E    F    G    H    I    J \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----|\n");
        System.out.print("  1 | " + playerBoard2[0][0] + " | " + playerBoard2[0][1] + " | " + playerBoard2[0][2] + " | " + playerBoard2[0][3] + " | " + playerBoard2[0][4] + " | " + playerBoard2[0][5] + " | " + playerBoard2[0][6] + " | " + playerBoard2[0][7] + " | " + playerBoard2[0][8] + " | " + playerBoard2[0][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  2 | " + playerBoard2[1][0] + " | " + playerBoard2[1][1] + " | " + playerBoard2[1][2] + " | " + playerBoard2[1][3] + " | " + playerBoard2[1][4] + " | " + playerBoard2[1][5] + " | " + playerBoard2[1][6] + " | " + playerBoard2[1][7] + " | " + playerBoard2[1][8] + " | " + playerBoard2[1][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  3 | " + playerBoard2[2][0] + " | " + playerBoard2[2][1] + " | " + playerBoard2[2][2] + " | " + playerBoard2[2][3] + " | " + playerBoard2[2][4] + " | " + playerBoard2[2][5] + " | " + playerBoard2[2][6] + " | " + playerBoard2[2][7] + " | " + playerBoard2[2][8] + " | " + playerBoard2[2][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  4 | " + playerBoard2[3][0] + " | " + playerBoard2[3][1] + " | " + playerBoard2[3][2] + " | " + playerBoard2[3][3] + " | " + playerBoard2[3][4] + " | " + playerBoard2[3][5] + " | " + playerBoard2[3][6] + " | " + playerBoard2[3][7] + " | " + playerBoard2[3][8] + " | " + playerBoard2[3][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  5 | " + playerBoard2[4][0] + " | " + playerBoard2[4][1] + " | " + playerBoard2[4][2] + " | " + playerBoard2[4][3] + " | " + playerBoard2[4][4] + " | " + playerBoard2[4][5] + " | " + playerBoard2[4][6] + " | " + playerBoard2[4][7] + " | " + playerBoard2[4][8] + " | " + playerBoard2[4][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  6 | " + playerBoard2[5][0] + " | " + playerBoard2[5][1] + " | " + playerBoard2[5][2] + " | " + playerBoard2[5][3] + " | " + playerBoard2[5][4] + " | " + playerBoard2[5][5] + " | " + playerBoard2[5][6] + " | " + playerBoard2[5][7] + " | " + playerBoard2[5][8] + " | " + playerBoard2[5][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  7 | " + playerBoard2[6][0] + " | " + playerBoard2[6][1] + " | " + playerBoard2[6][2] + " | " + playerBoard2[6][3] + " | " + playerBoard2[6][4] + " | " + playerBoard2[6][5] + " | " + playerBoard2[6][6] + " | " + playerBoard2[6][7] + " | " + playerBoard2[6][8] + " | " + playerBoard2[6][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  8 | " + playerBoard2[7][0] + " | " + playerBoard2[7][1] + " | " + playerBoard2[7][2] + " | " + playerBoard2[7][3] + " | " + playerBoard2[7][4] + " | " + playerBoard2[7][5] + " | " + playerBoard2[7][6] + " | " + playerBoard2[7][7] + " | " + playerBoard2[7][8] + " | " + playerBoard2[7][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  9 | " + playerBoard2[8][0] + " | " + playerBoard2[8][1] + " | " + playerBoard2[8][2] + " | " + playerBoard2[8][3] + " | " + playerBoard2[8][4] + " | " + playerBoard2[8][5] + " | " + playerBoard2[8][6] + " | " + playerBoard2[8][7] + " | " + playerBoard2[8][8] + " | " + playerBoard2[8][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print(" 10 | " + playerBoard2[9][0] + " | " + playerBoard2[9][1] + " | " + playerBoard2[9][2] + " | " + playerBoard2[9][3] + " | " + playerBoard2[9][4] + " | " + playerBoard2[9][5] + " | " + playerBoard2[9][6] + " | " + playerBoard2[9][7] + " | " + playerBoard2[9][8] + " | " + playerBoard2[9][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.println();
    }

    public static void taticalBord1(String[][] tacticalBoard1) {

        System.out.println();
        System.out.print("      A    B    C    D    E    F    G    H    I    J \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----|\n");
        System.out.print("  1 | " + tacticalBoard1[0][0] + " | " + tacticalBoard1[0][1] + " | " + tacticalBoard1[0][2] + " | " + tacticalBoard1[0][3] + " | " + tacticalBoard1[0][4] + " | " + tacticalBoard1[0][5] + " | " + tacticalBoard1[0][6] + " | " + tacticalBoard1[0][7] + " | " + tacticalBoard1[0][8] + " | " + tacticalBoard1[0][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  2 | " + tacticalBoard1[1][0] + " | " + tacticalBoard1[1][1] + " | " + tacticalBoard1[1][2] + " | " + tacticalBoard1[1][3] + " | " + tacticalBoard1[1][4] + " | " + tacticalBoard1[1][5] + " | " + tacticalBoard1[1][6] + " | " + tacticalBoard1[1][7] + " | " + tacticalBoard1[1][8] + " | " + tacticalBoard1[1][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  3 | " + tacticalBoard1[2][0] + " | " + tacticalBoard1[2][1] + " | " + tacticalBoard1[2][2] + " | " + tacticalBoard1[2][3] + " | " + tacticalBoard1[2][4] + " | " + tacticalBoard1[2][5] + " | " + tacticalBoard1[2][6] + " | " + tacticalBoard1[2][7] + " | " + tacticalBoard1[2][8] + " | " + tacticalBoard1[2][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  4 | " + tacticalBoard1[3][0] + " | " + tacticalBoard1[3][1] + " | " + tacticalBoard1[3][2] + " | " + tacticalBoard1[3][3] + " | " + tacticalBoard1[3][4] + " | " + tacticalBoard1[3][5] + " | " + tacticalBoard1[3][6] + " | " + tacticalBoard1[3][7] + " | " + tacticalBoard1[3][8] + " | " + tacticalBoard1[3][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  5 | " + tacticalBoard1[4][0] + " | " + tacticalBoard1[4][1] + " | " + tacticalBoard1[4][2] + " | " + tacticalBoard1[4][3] + " | " + tacticalBoard1[4][4] + " | " + tacticalBoard1[4][5] + " | " + tacticalBoard1[4][6] + " | " + tacticalBoard1[4][7] + " | " + tacticalBoard1[4][8] + " | " + tacticalBoard1[4][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  6 | " + tacticalBoard1[5][0] + " | " + tacticalBoard1[5][1] + " | " + tacticalBoard1[5][2] + " | " + tacticalBoard1[5][3] + " | " + tacticalBoard1[5][4] + " | " + tacticalBoard1[5][5] + " | " + tacticalBoard1[5][6] + " | " + tacticalBoard1[5][7] + " | " + tacticalBoard1[5][8] + " | " + tacticalBoard1[5][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  7 | " + tacticalBoard1[6][0] + " | " + tacticalBoard1[6][1] + " | " + tacticalBoard1[6][2] + " | " + tacticalBoard1[6][3] + " | " + tacticalBoard1[6][4] + " | " + tacticalBoard1[6][5] + " | " + tacticalBoard1[6][6] + " | " + tacticalBoard1[6][7] + " | " + tacticalBoard1[6][8] + " | " + tacticalBoard1[6][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  8 | " + tacticalBoard1[7][0] + " | " + tacticalBoard1[7][1] + " | " + tacticalBoard1[7][2] + " | " + tacticalBoard1[7][3] + " | " + tacticalBoard1[7][4] + " | " + tacticalBoard1[7][5] + " | " + tacticalBoard1[7][6] + " | " + tacticalBoard1[7][7] + " | " + tacticalBoard1[7][8] + " | " + tacticalBoard1[7][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  9 | " + tacticalBoard1[8][0] + " | " + tacticalBoard1[8][1] + " | " + tacticalBoard1[8][2] + " | " + tacticalBoard1[8][3] + " | " + tacticalBoard1[8][4] + " | " + tacticalBoard1[8][5] + " | " + tacticalBoard1[8][6] + " | " + tacticalBoard1[8][7] + " | " + tacticalBoard1[8][8] + " | " + tacticalBoard1[8][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print(" 10 | " + tacticalBoard1[9][0] + " | " + tacticalBoard1[9][1] + " | " + tacticalBoard1[9][2] + " | " + tacticalBoard1[9][3] + " | " + tacticalBoard1[9][4] + " | " + tacticalBoard1[9][5] + " | " + tacticalBoard1[9][6] + " | " + tacticalBoard1[9][7] + " | " + tacticalBoard1[9][8] + " | " + tacticalBoard1[9][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.println();
    }

    public static void taticalBord2(String[][] tacticalBoard2) {
        System.out.println();
        System.out.print("      A    B    C    D    E    F    G    H    I    J \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----|\n");
        System.out.print("  1 | " + tacticalBoard2[0][0] + " | " + tacticalBoard2[0][1] + " | " + tacticalBoard2[0][2] + " | " + tacticalBoard2[0][3] + " | " + tacticalBoard2[0][4] + " | " + tacticalBoard2[0][5] + " | " + tacticalBoard2[0][6] + " | " + tacticalBoard2[0][7] + " | " + tacticalBoard2[0][8] + " | " + tacticalBoard2[0][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  2 | " + tacticalBoard2[1][0] + " | " + tacticalBoard2[1][1] + " | " + tacticalBoard2[1][2] + " | " + tacticalBoard2[1][3] + " | " + tacticalBoard2[1][4] + " | " + tacticalBoard2[1][5] + " | " + tacticalBoard2[1][6] + " | " + tacticalBoard2[1][7] + " | " + tacticalBoard2[1][8] + " | " + tacticalBoard2[1][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  3 | " + tacticalBoard2[2][0] + " | " + tacticalBoard2[2][1] + " | " + tacticalBoard2[2][2] + " | " + tacticalBoard2[2][3] + " | " + tacticalBoard2[2][4] + " | " + tacticalBoard2[2][5] + " | " + tacticalBoard2[2][6] + " | " + tacticalBoard2[2][7] + " | " + tacticalBoard2[2][8] + " | " + tacticalBoard2[2][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  4 | " + tacticalBoard2[3][0] + " | " + tacticalBoard2[3][1] + " | " + tacticalBoard2[3][2] + " | " + tacticalBoard2[3][3] + " | " + tacticalBoard2[3][4] + " | " + tacticalBoard2[3][5] + " | " + tacticalBoard2[3][6] + " | " + tacticalBoard2[3][7] + " | " + tacticalBoard2[3][8] + " | " + tacticalBoard2[3][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  5 | " + tacticalBoard2[4][0] + " | " + tacticalBoard2[4][1] + " | " + tacticalBoard2[4][2] + " | " + tacticalBoard2[4][3] + " | " + tacticalBoard2[4][4] + " | " + tacticalBoard2[4][5] + " | " + tacticalBoard2[4][6] + " | " + tacticalBoard2[4][7] + " | " + tacticalBoard2[4][8] + " | " + tacticalBoard2[4][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  6 | " + tacticalBoard2[5][0] + " | " + tacticalBoard2[5][1] + " | " + tacticalBoard2[5][2] + " | " + tacticalBoard2[5][3] + " | " + tacticalBoard2[5][4] + " | " + tacticalBoard2[5][5] + " | " + tacticalBoard2[5][6] + " | " + tacticalBoard2[5][7] + " | " + tacticalBoard2[5][8] + " | " + tacticalBoard2[5][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  7 | " + tacticalBoard2[6][0] + " | " + tacticalBoard2[6][1] + " | " + tacticalBoard2[6][2] + " | " + tacticalBoard2[6][3] + " | " + tacticalBoard2[6][4] + " | " + tacticalBoard2[6][5] + " | " + tacticalBoard2[6][6] + " | " + tacticalBoard2[6][7] + " | " + tacticalBoard2[6][8] + " | " + tacticalBoard2[6][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  8 | " + tacticalBoard2[7][0] + " | " + tacticalBoard2[7][1] + " | " + tacticalBoard2[7][2] + " | " + tacticalBoard2[7][3] + " | " + tacticalBoard2[7][4] + " | " + tacticalBoard2[7][5] + " | " + tacticalBoard2[7][6] + " | " + tacticalBoard2[7][7] + " | " + tacticalBoard2[7][8] + " | " + tacticalBoard2[7][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print("  9 | " + tacticalBoard2[8][0] + " | " + tacticalBoard2[8][1] + " | " + tacticalBoard2[8][2] + " | " + tacticalBoard2[8][3] + " | " + tacticalBoard2[8][4] + " | " + tacticalBoard2[8][5] + " | " + tacticalBoard2[8][6] + " | " + tacticalBoard2[8][7] + " | " + tacticalBoard2[8][8] + " | " + tacticalBoard2[8][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.print(" 10 | " + tacticalBoard2[9][0] + " | " + tacticalBoard2[9][1] + " | " + tacticalBoard2[9][2] + " | " + tacticalBoard2[9][3] + " | " + tacticalBoard2[9][4] + " | " + tacticalBoard2[9][5] + " | " + tacticalBoard2[9][6] + " | " + tacticalBoard2[9][7] + " | " + tacticalBoard2[9][8] + " | " + tacticalBoard2[9][9] + " | \n");
        System.out.print("    |----|----|----|----|----|----|----|----|----|----| \n");
        System.out.println();
    }
}

