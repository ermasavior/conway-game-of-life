import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniverseTest {
    @Test
    public void initialize() {
        // World Map
        String row1 = ".O";
        String row2 = "O.";
        char[][] worldMapArr = {{'.', 'O'}, {'O', '.'}};

        Universe universe = new Universe(worldMapArr);
        assertEquals(universe.worldMap.size(), 4);
        assertEquals(universe.worldMap.get(new Point(0,0)).isAlive, false);
        assertEquals(universe.worldMap.get(new Point(0,1)).isAlive, true);
        assertEquals(universe.worldMap.get(new Point(1,0)).isAlive, true);
        assertEquals(universe.worldMap.get(new Point(1,1)).isAlive, false);
    }

    @Test
    public void getWorldMapArrTest() {
        String row1 = ".O";
        String row2 = "O.";
        char[][] worldMapArr = {{'.', 'O'}, {'O', '.'}};

        Universe universe = new Universe(worldMapArr);
        ArrayList<ArrayList<String>> worldMapResult = universe.getWorldMapArr();

        assertEquals(Cell.deadSymbol, worldMapResult.get(0).get(0));
        assertEquals(Cell.aliveSymbol, worldMapResult.get(0).get(1));
        assertEquals(Cell.aliveSymbol, worldMapResult.get(1).get(0));
        assertEquals(Cell.deadSymbol, worldMapResult.get(1).get(1));
    }
}
