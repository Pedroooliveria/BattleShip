package Boats;

public class Submarine extends Ship {
    private String symbole = "⚓️️";
    private int size;

    public Submarine() {
    }

    public Submarine(String symbole, int size) {
        this.symbole = symbole;
    }

    @Override
    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    public int getSize() {
        return 3;
    }

}