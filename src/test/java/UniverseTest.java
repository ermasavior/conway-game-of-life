import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniverseTest {
    @Test
    public void initialize() {
        char[][] worldMapArr = {{'.', 'O'}, {'O', '.'}};

        Universe universe = new Universe(worldMapArr);
        assertEquals(4, universe.worldMap.size());
        assertEquals(false, universe.worldMap.get(new Point(0,0)).isAlive);
        assertEquals(true, universe.worldMap.get(new Point(0,1)).isAlive);
        assertEquals(true, universe.worldMap.get(new Point(1,0)).isAlive);
        assertEquals(false, universe.worldMap.get(new Point(1,1)).isAlive);
    }

    @Test
    public void getWorldMapArrTest() {
        char[][] worldMapArr = {{'.', 'O'}, {'O', '.'}};

        Universe universe = new Universe(worldMapArr);
        char[][] worldMapResult = universe.getWorldMapArr();

        assertEquals(Cell.deadSymbol, worldMapResult[0][0]);
        assertEquals(Cell.aliveSymbol, worldMapResult[0][1]);
        assertEquals(Cell.aliveSymbol, worldMapResult[1][0]);
        assertEquals(Cell.deadSymbol, worldMapResult[1][1]);
    }

    @Test
    public void whenCoordinateIsValid_getWorldMapCellTest() {
        char[][] worldMapArr = {{'.', 'O'}, {'O', '.'}};
        Universe universe = new Universe(worldMapArr);

        Point coordinate = new Point(0,0);
        assertEquals(coordinate, universe.getWorldMapCell(coordinate).coordinate);
        assertEquals(false, universe.getWorldMapCell(coordinate).isAlive);
    }

    @Test
    public void whenCoordinateIsInValid_getWorldMapCellTest() {
        char[][] worldMapArr = {{'.', 'O'}, {'O', '.'}};
        Universe universe = new Universe(worldMapArr);

        Point coordinate = new Point(-1,-1);
        assertEquals(null, universe.getWorldMapCell(coordinate));
    }

    @Test
    public void nextCycleTest() {
        char[][] worldMapArr = {
                {'.', 'O', '.'},
                {'.', 'O', '.'},
                {'.', 'O', '.'}
        };
        Universe universe = new Universe(worldMapArr);
        universe.nextCycle();

        assertEquals(true, universe.getWorldMapCell(new Point(0, 1)).isAlive);
        assertEquals(true, universe.getWorldMapCell(new Point(1, 1)).isAlive);
        assertEquals(true, universe.getWorldMapCell(new Point(2, 1)).isAlive);
    }
}
