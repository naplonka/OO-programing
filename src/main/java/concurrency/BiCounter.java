package concurrency;

public class BiCounter {


    private int i = 0;
    private int j = 0;
// Tylko jedna metoda będzie wykonana w jednym wątku przez symchronized
    // będzie to rzutowało na wydajność
    synchronized public void  incrementI() {
        i++;
    }

    public int getI() {
        return i;
    }

    synchronized public void  incrementJ() {
        j++;
    }

    public int geJ() {
        return j;
    }

}
