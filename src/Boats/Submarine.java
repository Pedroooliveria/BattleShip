package Boats;

public class Submarine extends Ship {
    private String symbol = "⚓️";
    private int size;

    public Submarine() {
    }

    public Submarine(String symbole, int size) {
        this.symbol = symbole;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getSize() {
        return 3;
    }

}