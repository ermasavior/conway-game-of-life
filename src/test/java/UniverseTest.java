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
        ArrayList<ArrayList<String>> worldMapArr = new ArrayList<>();
        worldMapArr.add(new ArrayList<String>(Arrays.asList(row1.split(""))));
        worldMapArr.add(new ArrayList<String>(Arrays.asList(row2.split(""))));

        Universe universe = new Universe(worldMapArr);
        assertEquals(universe.worldMap.size(), 4);
        assertEquals(universe.worldMap.get(new Point(0,0)).alive, false);
        assertEquals(universe.worldMap.get(new Point(0,1)).alive, true);
        assertEquals(universe.worldMap.get(new Point(1,0)).alive, true);
        assertEquals(universe.worldMap.get(new Point(1,1)).alive, false);

    }
}
