import java.awt.*;

public class Cell {
    public static String aliveSymbol = "O";
    public static String deadSymbol = ".";

    public Point coordinate;
    public boolean isAlive;

    public Cell(Point coordinate, boolean isAlive) {
        this.coordinate = coordinate;
        this.isAlive = isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String getIsAliveSymbol() {
        if (this.isAlive) {
            return aliveSymbol;
        } else {
            return deadSymbol;
        }
    }
}
