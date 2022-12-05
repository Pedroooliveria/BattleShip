package Boats;

public class Destroyer extends Ship {
    private String symbol = "🛶 ";
    private int size;

    public Destroyer() {
    }

    public Destroyer(String symbole, int size) {
        this.symbol = symbole;
        this.size = size;

    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getSize() {
        return 2;
    }
}