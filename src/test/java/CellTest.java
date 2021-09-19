import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;
import java.util.ArrayList;

public class CellTest {
    @Test
    public void initialize() {
        Point coordinate = new Point(1, 1);
        boolean isAlive = false;
        Cell cell = new Cell(coordinate, isAlive);

        assertEquals(coordinate, cell.coordinate);
        assertEquals(isAlive, cell.isAlive);
    }

    @Test
    public void setAliveTest() {
        Cell cell = new Cell(new Point(1, 1), false);

        cell.setAlive(true);
        assertEquals(true, cell.isAlive);
    }

    @Test
    public void getIsAliveSymbol() {
        Cell cell = new Cell(new Point(1, 1), false);
        assertEquals(Cell.deadSymbol, cell.getIsAliveSymbol());

        cell.setAlive(true);
        assertEquals(Cell.aliveSymbol, cell.getIsAliveSymbol());
    }

    @Test
    public void getNeighborCoordinates() {
        Cell cell = new Cell(new Point(1, 1), true);
        ArrayList<Point> neighborCoors = cell.getNeighborCoordinates();

        ArrayList<Point> expectedCoors = new ArrayList<>();
        expectedCoors.add(new Point(0, 0));
        expectedCoors.add(new Point(0, 1));
        expectedCoors.add(new Point(0, 2));
        expectedCoors.add(new Point(1, 0));
        expectedCoors.add(new Point(1, 2));
        expectedCoors.add(new Point(2, 0));
        expectedCoors.add(new Point(2, 1));
        expectedCoors.add(new Point(2, 2));

        for(int i = 0; i < 8; i++) {
            assertEquals(expectedCoors.get(0), neighborCoors.get(0));
        }
    }

    @Test
    public void countAliveNeighborsTest() {
        Cell cell = new Cell(new Point(1, 0), true);

        char[][] worldMapArr = {{'O', 'O'}, {'O', '.'}};
        Universe universe = new Universe(worldMapArr);

        assertEquals(2, cell.countAliveNeighbors(universe));
    }
}
