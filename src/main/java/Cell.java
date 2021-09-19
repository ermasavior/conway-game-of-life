import java.awt.*;

public class Cell {
    public Point coordinate;
    public boolean alive;

    public Cell(Point coordinate, boolean alive) {
        this.coordinate = coordinate;
        this.alive = alive;
    }
}
