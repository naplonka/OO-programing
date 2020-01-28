package exeption;

public class CheckExceptionRunner {
    public static void main(String[] args) {
        try {
            someOtherMethod();
            Thread.sleep(2000);//Thread sleep zmusza nas do obslużenia wyjątku
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        someOtherMethod2();
    }

    private static void someOtherMethod() throws InterruptedException{//InteraptedException cheked extends Exception, very risky
        Thread.sleep(1000);//risky method wymuszają rzeucenie wyjątku
    }

    private static void someOtherMethod2() throws RuntimeException{

    }

//Expection is coś co możemy obsłużyć
    //RuntimeException wszystkie subklasy, nie jest aż tak ryzykowne
    //Error extends Throwable nie mogą być obsłużone
}
