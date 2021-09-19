import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    @Test
    public void loadUniverseTest() {
        String[] rawMap = {"O.", ".O"};
        Game game = new Game();
        game.loadUniverse(rawMap);

        assertEquals(4, game.universe.worldMap.size());
    }

    @Test
    public void printUniverseTest() {
        String[] rawMap = {"O.", ".O"};
        Game game = new Game();
        game.loadUniverse(rawMap);

        game.printUniverse();
    }
}
