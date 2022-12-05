import Boats.Grid;

import java.util.Scanner;

public class Menu {

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                " ▄▄▄▄▄▄▄▄▄▄   ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄            ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                        "▐░░░░░░░░░░▌ ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌          ▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌\n" +
                        "▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀█░█▀▀▀▀  ▀▀▀▀█░█▀▀▀▀ ▐░▌          ▐░█▀▀▀▀▀▀▀▀▀      ▐░█▀▀▀▀▀▀▀▀▀ ▐░▌       ▐░▌ ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌\n" +
                        "▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌          ▐░▌     ▐░▌          ▐░▌               ▐░▌          ▐░▌       ▐░▌     ▐░▌     ▐░▌       ▐░▌\n" +
                        "▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░▌          ▐░▌     ▐░▌          ▐░█▄▄▄▄▄▄▄▄▄      ▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌     ▐░▌     ▐░█▄▄▄▄▄▄▄█░▌\n" +
                        "▐░░░░░░░░░░▌ ▐░░░░░░░░░░░▌     ▐░▌          ▐░▌     ▐░▌          ▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░▌     ▐░░░░░░░░░░░▌\n" +
                        "▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌     ▐░▌          ▐░▌     ▐░▌          ▐░█▀▀▀▀▀▀▀▀▀       ▀▀▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌     ▐░▌     ▐░█▀▀▀▀▀▀▀▀▀ \n" +
                        "▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌          ▐░▌     ▐░▌          ▐░▌                         ▐░▌▐░▌       ▐░▌     ▐░▌     ▐░▌          \n" +
                        "▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌     ▐░▌          ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌ ▄▄▄▄█░█▄▄▄▄ ▐░▌          \n" +
                        "▐░░░░░░░░░░▌ ▐░▌       ▐░▌     ▐░▌          ▐░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌          \n" +
                        " ▀▀▀▀▀▀▀▀▀▀   ▀         ▀       ▀            ▀       ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀       ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀           \n" +
                        "                                                                                                                                       \n");
        String choose = " ";
        Player newPlayer1 = new Player();
        Player newPlayer2 = new Player();
        Grid array = new Grid();
        while (!choose.equals("2")) {

            System.out.println("1-Play ");
            System.out.println("2-Leave");
            System.out.print(": ");
            choose = scanner.next();
            if (choose.equals("1")) {
                System.out.println("Fɪʀsᴛ ᴘʟᴀʏᴇʀ ");
                array.check();
                newPlayer1.setBoats(array.player1);
                System.out.println("Sᴇᴄᴏɴᴅ ᴘʟᴀʏᴇʀ ");
                newPlayer2.setBoats(array.player2);
                Board.boardPlayer(array.player1);
                Board.boardPlayer(array.player2);
                while (newPlayer2.count1 < 17 || newPlayer1.count < 17) {
                    System.out.println("Fɪʀsᴛ ᴘʟᴀʏᴇʀ ");
                    Board.taticalBord(array.tactical1);
                    newPlayer1.attack(array.player2, array.tactical1);
                    System.out.println("Sᴇᴄᴏɴᴅ ᴘʟᴀʏᴇʀ ");
                    Board.taticalBord(array.tactical2);
                    newPlayer2.attack(array.player1, array.tactical2);
                }
                if (newPlayer1.count == 17) {
                    System.out.println("First Player WIN!");
                }
                if (newPlayer2.count1 == 17) {
                    System.out.println("Second Player WIN!");
                }
            }
        }
    }
}
