package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

    private final String name;

    public CallableTask(String name){
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello " + name;
    }
}

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Create task co coś zwraca
        ExecutorService executorService = Executors.newFixedThreadPool(1);//Response z executor service nazywa się Future
        //jest to promise co nas później czeka
        Future<String> welcomeFuture =executorService.submit(new CallableTask("in Something More"));
        System.out.println("\n new CallableTask ");

        String welcomeMessage = welcomeFuture.get();//get oznacza że następna linia się wykona tylko wtedy kiedy welcome future się wykona

        System.out.println(welcomeMessage);
        System.out.println("\n Main complete");

        executorService.shutdown();
    }
    /* new CallableTask
Hello in Something More

 Main complete
*/
}
