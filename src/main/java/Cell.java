import java.awt.*;
import java.util.ArrayList;

public class Cell {
    public Point coordinate;
    public boolean alive;

    public Cell(Point coordinate, boolean alive) {
        this.coordinate = coordinate;
        this.alive = alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
