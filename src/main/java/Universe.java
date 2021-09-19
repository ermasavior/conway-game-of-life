import java.awt.*;
import java.util.*;

public class Universe {
    private static String aliveSymbol = "O";
    private int maxArrMapSize = 1;
    public Map<Point, Cell> worldMap = new HashMap<Point, Cell>();

    public Universe(ArrayList<ArrayList<String>> worldMapArr) {
        initWorldMap(worldMapArr);
    }

    public ArrayList<ArrayList<String>> getWorldMapArr() {
        ArrayList<String> emptyRow = new ArrayList<>(Collections.nCopies(maxArrMapSize, Cell.deadSymbol));
        ArrayList<ArrayList<String>> worldMapArr = new ArrayList<>(Collections.nCopies(maxArrMapSize, emptyRow));

        for (Map.Entry<Point, Cell> cellEntry: worldMap.entrySet()) {
            Point coor = cellEntry.getKey();
            System.out.println(coor);
            System.out.println(cellEntry.getValue().getIsAliveSymbol());

            if (isCoordinateValid(coor)) {
                worldMapArr.get(coor.x).set(coor.y, worldMap.get(coor).getIsAliveSymbol());
            }
        }
        System.out.println(worldMapArr);

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

    private boolean isCoordinateValid(Point coor) {
        return (coor.x >= 0 && coor.x < maxArrMapSize && coor.y >= 0 && coor.y < maxArrMapSize);
    }
}
