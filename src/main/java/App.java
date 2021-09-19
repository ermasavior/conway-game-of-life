public class App {
    public static void main(String[] args) {
        String[] worldMap = {
                "..O..",
                "..O..",
                "..O.."
        };
        String[] worldMap2 = {
                "......",
                "..OOO.",
                ".OOO..",
                "......"
        };

        Game game = new Game();
        game.loadUniverse(worldMap);
        game.start();
    }
}
