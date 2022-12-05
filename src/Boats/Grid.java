package Boats;

public class Grid {
    public String[][] player1 = new String[10][10];
    public String[][] tactical1 = new String[10][10];
    public String[][] player2 = new String[10][10];
    public String[][] tactical2 = new String[10][10];

    public void check() {
        for (int i = 0; i < player1.length; i++) {
            for (int j = 0; j < player1[i].length; j++) {
                player1[i][j] = "  ";
            }
        }
        for (int i = 0; i < tactical1.length; i++) {
            for (int j = 0; j < tactical1[i].length; j++) {
                tactical1[i][j] = "  ";
            }
        }
        for (int i = 0; i < player2.length; i++) {
            for (int j = 0; j < player2[i].length; j++) {
                player2[i][j] = "  ";
            }
        }
        for (int i = 0; i < tactical2.length; i++) {
            for (int j = 0; j < tactical2[i].length; j++) {
                tactical2[i][j] = "  ";
            }
        }

    }
}
