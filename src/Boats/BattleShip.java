package Boats;

public class BattleShip extends Ship{

    private String symbole = "🚢";
    private int size;

    public BattleShip() {
    }

    public BattleShip(String symbole, int size) {
        this.symbole = symbole;
        this.size=size;


    }
    @Override
    public String getSymbole() {
        return symbole;
    }

    public void setBattleShip(String symbole) {
        this.symbole = symbole;
    }



    public int getSize() {
        return 4;
    }

}
