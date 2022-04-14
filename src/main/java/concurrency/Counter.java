package concurrency;

public class Counter {
    int i;
    synchronized public void  increment() {
        i++;// To nie jest wątkowo bezpieczna metoda, taka metoda jest bezpieczna wątkowo kiedy możemy puścić w wielu wątkach i jesteśmy pewnie że dostaniemy jednakowe wyniki.
    }//not thread safe
    //dlatego do takiej metody dodajemy synchronized, żebyśmy byli pewni że metoda wykona jest w jednym wątku
    //synchronized public void

    public int getI() {
        return i;
    }
}
