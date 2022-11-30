package Boats;

public class Cruiser extends Ship{
    private String symbole = "🚤";
    private int size ;

    public Cruiser() {
    }

    public Cruiser(String symbole, int size) {
        this.symbole = symbole;
        this.size = size;
    }

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