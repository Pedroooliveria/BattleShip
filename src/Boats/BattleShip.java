package Boats;

public class BattleShip extends Ship{

    private String symbol = "🚢";
    private int size;

    public BattleShip() {
    }

    public BattleShip(String symbole, int size) {
        this.symbol = symbole;
        this.size=size;


    }
    @Override
    public String getSymbol() {
        return symbol;
    }

    public void setBattleShip(String symbole) {
        this.symbol = symbole;
    }



    public int getSize() {
        return 4;
    }

}
