import java.awt.*;
import java.util.ArrayList;

public class Cell {
    public Point coordinate;
    public boolean isAlive;

    public Cell(Point coordinate, boolean isAlive) {
        this.coordinate = coordinate;
        this.isAlive = isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
}
