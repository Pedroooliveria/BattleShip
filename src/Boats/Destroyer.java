package Boats;

public class Destroyer extends Ship {
    private String symbole = "🛶 ";
    private int size;

    public Destroyer() {
    }

    public Destroyer(String symbole, int size) {
        this.symbole = symbole;
        this.size = size;

    }

    @Override
    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    public int getSize() {
        return 2;
    }
}