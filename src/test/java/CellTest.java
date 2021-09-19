import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

public class CellTest {
    @Test
    public void initialize() {
        Point coordinate = new Point(1, 1);
        boolean alive = false;
        Cell cell = new Cell(coordinate, alive);

        assertEquals(cell.coordinate, coordinate);
        assertEquals(cell.alive, alive);
    }

    @Test
    public void setAliveTest() {
        Point coordinate = new Point(1, 1);
        boolean alive = false;
        Cell cell = new Cell(coordinate, alive);

        boolean newAlive = true;
        cell.setAlive(newAlive);
        assertEquals(cell.alive, newAlive);
    }
}
