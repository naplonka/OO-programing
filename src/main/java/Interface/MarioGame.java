package Interface;

public class MarioGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("jump");
    }

    @Override
    public void down() {
        System.out.println("Goest into holes");
    }
}
