public class App {
    public static void main(String[] args) {
        String[] worldMap = {
                "...O...",
                "...O..",
                "...O..."
        };

        Game game = new Game();
        game.loadUniverse(worldMap);
        game.start();
    }
}
