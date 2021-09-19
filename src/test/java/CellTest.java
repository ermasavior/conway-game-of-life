import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

public class CellTest {
    @Test
    public void initialize() {
        Point coordinate = new Point(1, 1);
        boolean isAlive = false;
        Cell cell = new Cell(coordinate, isAlive);

        assertEquals(cell.coordinate, coordinate);
        assertEquals(cell.isAlive, isAlive);
    }

    @Test
    public void setAliveTest() {
        Point coordinate = new Point(1, 1);
        boolean isAlive = false;
        Cell cell = new Cell(coordinate, isAlive);

        boolean newIsAlive = true;
        cell.setAlive(newIsAlive);
        assertEquals(cell.isAlive, newIsAlive);
    }
}
