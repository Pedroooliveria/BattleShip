package Boats;

public class Carrier extends Ship {

    private String symbole = "🛳️";
    private int size;

    public Carrier() {
    }

    public Carrier(String symbole, int size) {
        this.symbole = symbole;
        this.size = size;
    }

    @Override
    public String getSymbole() {
        return symbole;
    }

    public void getSymbole(String symbole) {
        this.symbole = symbole;
    }

    public int getSize() {
        return 5;
    }
}
