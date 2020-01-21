package thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleColableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Create task co coś zwraca
        ExecutorService executorService = Executors.newFixedThreadPool(3);//Response z executor service nazywa się Future
        //jest to promise co nas później czeka

        Future<String> welcomeFuture = executorService.submit(new CallableTask("in Something More"));

        List<CallableTask> tasks = List.of(new CallableTask("Collable task one"), new CallableTask("Second super task"), new CallableTask("Super third task"));
        //Możemy stworzyć liste tasków i je wywoływać po kolei

        List<Future<String>> futureList = executorService.invokeAll(tasks);

        for(Future<String> stringFuture: futureList) {
            System.out.println(stringFuture.get());
        }

        executorService.shutdown();//kończy działanie wszystkich threads (wątków)

    }
}
