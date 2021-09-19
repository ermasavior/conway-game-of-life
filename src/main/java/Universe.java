import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Universe {
    private static String aliveSymbol = "O";
    public Map<Point, Cell> worldMap = new HashMap<Point, Cell>();

    public Universe(ArrayList<ArrayList<String>> worldMapArr) {
        initWorldMap(worldMapArr);
    }

    public ArrayList<ArrayList<String>> getWorldMapArr() {
        ArrayList<ArrayList<String>> worldMapArr = new ArrayList<>(50);
        for (Map.Entry<Point, Cell> cellEntry: worldMap.entrySet()) {
            Point coor = cellEntry.getKey();
            worldMapArr.get(coor.y).set(coor.x, worldMapArr.get(coor.y).get(coor.x));
        }

        return worldMapArr;
    }

    private void initWorldMap(ArrayList<ArrayList<String>> worldMapArr) {
        for(int y = 0; y < worldMapArr.size(); y++) {
            ArrayList<String> row = worldMapArr.get(y);

            for(int x = 0; x < row.size(); x++) {
                Point coor = new Point(x, y);
                boolean isAlive = row.get(x).equals(aliveSymbol);

                worldMap.put(coor, new Cell(coor, isAlive));
            }
        }
    }
}
