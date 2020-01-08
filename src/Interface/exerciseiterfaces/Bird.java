package Interface.exerciseiterfaces;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird fly with wings");
    }
}
