import java.awt.*;
import java.util.ArrayList;

public class Cell {
    public static char aliveSymbol = 'O';
    public static char deadSymbol = '.';

    public Point coordinate;
    public boolean isAlive;

    public Cell(Point coordinate, boolean isAlive) {
        this.coordinate = coordinate;
        this.isAlive = isAlive;
    }

    public char getIsAliveSymbol() {
        if (this.isAlive) {
            return aliveSymbol;
        } else {
            return deadSymbol;
        }
    }

    public ArrayList<Point> getNeighborCoordinates() {
        ArrayList<Point> neighborCoors = new ArrayList<>();
        neighborCoors.add(new Point(this.coordinate.x - 1, this.coordinate.y - 1));
        neighborCoors.add(new Point(this.coordinate.x - 1, this.coordinate.y));
        neighborCoors.add(new Point(this.coordinate.x - 1, this.coordinate.y + 1));

        neighborCoors.add(new Point(this.coordinate.x, this.coordinate.y - 1));
        neighborCoors.add(new Point(this.coordinate.x, this.coordinate.y + 1));

        neighborCoors.add(new Point(this.coordinate.x + 1, this.coordinate.y - 1));
        neighborCoors.add(new Point(this.coordinate.x + 1, this.coordinate.y));
        neighborCoors.add(new Point(this.coordinate.x + 1, this.coordinate.y + 1));

        return neighborCoors;
    }

    public int countAliveNeighbors(Universe universe) {
        ArrayList<Point> neighborCoors = this.getNeighborCoordinates();

        int count = 0;
        for(Point coor: neighborCoors) {
            if (universe.getWorldMapCell(coor) != null && universe.getWorldMapCell(coor).isAlive)
                count++;
        }

        return count;
    }
}
