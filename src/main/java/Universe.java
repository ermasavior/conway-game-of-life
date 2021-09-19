import java.awt.*;
import java.util.*;

public class Universe {
    private int maxArrMapSize = 2;
    public Map<Point, Cell> worldMap = new HashMap<Point, Cell>();

    public Universe(char[][] worldMapArr) {
        initWorldMap(worldMapArr);
    }

    public ArrayList<ArrayList<String>> getWorldMapArr() {
        ArrayList<String> mapRow = new ArrayList<>(Collections.nCopies(maxArrMapSize, "xxx"));
        ArrayList<ArrayList<String>> worldMapArr = new ArrayList<>(Collections.nCopies(maxArrMapSize, mapRow));
//
//        for (Map.Entry<Point, Cell> cellEntry: worldMap.entrySet()) {
//            Point coor = cellEntry.getKey();
//            System.out.println(coor);
//
//            if (isCoordinateValid(coor)) {
//                worldMapArr.get(coor.y).set(coor.x, cellEntry.getValue().getIsAliveSymbol());
//            }
//        }
//        worldMapArr.get(0).set(0, "zz");
//        System.out.println(worldMapArr);
//        worldMapArr.set(1, "aduh");
//        System.out.println(worldMapArr);

        return worldMapArr;
    }

    private void initWorldMap(char[][] worldMapArr) {
        for(int y = 0; y < worldMapArr.length; y++) {
            for(int x = 0; x < worldMapArr[y].length; x++) {
                Point coor = new Point(x, y);
                boolean isAlive = worldMapArr[y][x] == Cell.aliveSymbol;

                worldMap.put(coor, new Cell(coor, isAlive));
            }
        }
    }

    private boolean isCoordinateValid(Point coor) {
        return (coor.x >= 0 && coor.x < maxArrMapSize && coor.y >= 0 && coor.y < maxArrMapSize);
    }
}
