package Interface.exerciseiterfaces;

public class Aeroplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Aeroplane fly with fuel");
    }
}
