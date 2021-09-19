import java.awt.*;
import java.util.*;

public class Universe {
    private int maxArrMapSize = 10;
    public Map<Point, Cell> worldMap = new HashMap<Point, Cell>();

    public Universe(char[][] worldMapArr) {
        initWorldMap(worldMapArr);
    }

    public char[][] getWorldMapArr() {
        char[][] worldMapArr = new char[maxArrMapSize][maxArrMapSize];
        for(char[] mapRow: worldMapArr)
            Arrays.fill(mapRow, Cell.deadSymbol);

        for (Map.Entry<Point, Cell> cellEntry: worldMap.entrySet()) {
            Point coor = cellEntry.getKey();
            if (isCoordinateValid(coor)) {
                worldMapArr[coor.y][coor.x] = cellEntry.getValue().getIsAliveSymbol();
            }
        }

        return worldMapArr;
    }

    public Cell getWorldMapCell(Point coordinate) {
        return this.worldMap.getOrDefault(coordinate, null);
    }

    public void nextCycle() {
        for(Map.Entry<Point, Cell> cellEntry: worldMap.entrySet()) {
            if (cellEntry.getValue().isAlive) {
                applyRules(cellEntry.getValue());
            }
        }
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

    private void applyRules(Cell cell) {
        int neighborCount = cell.countAliveNeighbors(this);
        if (neighborCount < 2)
            cell.setAlive(false);
        else if (neighborCount == 2 || neighborCount == 3)
            cell.setAlive(true);
    }
}
