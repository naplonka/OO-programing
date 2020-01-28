package concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {


    private AtomicInteger i = new AtomicInteger(); //teraz można usunąć lock, dzięki temu że mam AtomicInteger
    private int j = 0;

    Lock lockFortI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    synchronized public void  incrementI() {
        i.incrementAndGet();// teraz jesteśmy pewni że ta metoda jest bezpieczna wątkowo
    }

    public int getI() {
        return i.get();
    }

    synchronized public void  incrementJ() {
        lockForJ.lock();
        j++;
        lockForJ.unlock();
    }

    public int geJ() {
        return j;
    }

}
