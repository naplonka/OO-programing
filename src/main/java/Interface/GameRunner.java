package Interface;

public class GameRunner {
    public static void main(String[] args) {
        GamingConsole marioGame = new MarioGame();
//        GamingConsole chess = new Chess;
        marioGame.down();
        marioGame.up();
    }

}
