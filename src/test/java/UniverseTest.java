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
}
