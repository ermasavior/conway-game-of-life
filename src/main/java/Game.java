public class Game {
    public Universe universe;

    public void loadUniverse(String[] rawMap) {
        char[][] worldMapArr = new char[rawMap.length][];
        int i = 0;
        for(String row: rawMap) {
            worldMapArr[i] = row.toCharArray();
            i++;
        }

        this.universe = new Universe(worldMapArr);
    }

    public void printUniverse() {
        char[][] worldMapArr = this.universe.getWorldMapArr();
        for(char[] mapRow: worldMapArr)
            System.out.println(mapRow);
    }
}
