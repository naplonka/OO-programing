package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {


    private int i = 0;
    private int j = 0;

    Lock lockFortI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    synchronized public void  incrementI() {
        lockFortI.lock();//Get lock for I
        i++;// to nie jest atomic operation dlatego nie możemy liczyć na to że się wykona w wątku
        //Dlatego też sworzono atomic classes
        lockFortI.unlock();//Release lock for I
        // To onzacza że jeżeli synchorniczne metody uruchomimy w wielu wątkach będzie mogły się one wykonać w tych wątkach równolegle
    }

    public int getI() {
        return i;
    }

    synchronized public void  incrementJ() {
        lockForJ.lock(); //Get lock for J
        j++;
        lockForJ.unlock(); //Release J
    }

    public int geJ() {
        return j;
    }

}
