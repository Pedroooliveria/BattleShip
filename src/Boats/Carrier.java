package Boats;

public class Carrier extends Ship {

    private String symbol = "Q";
    private int size;

    public Carrier() {
    }

    public Carrier(String symbole, int size) {
        this.symbol = symbole;
        this.size = size;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    public void getSymbol(String symbole) {
        this.symbol = symbole;
    }

    public int getSize() {
        return 5;
    }
}
