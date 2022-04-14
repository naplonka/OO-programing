package Interface.exerciseiterfaces;

public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyable = {new Bird(), new Aeroplane()};
        for (Flyable object : flyable) {
            object.fly();
        }
    }
}
