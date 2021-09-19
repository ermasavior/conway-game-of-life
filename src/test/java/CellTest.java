import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

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
}
