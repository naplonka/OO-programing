package thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCollableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Create task co coś zwraca
        ExecutorService executorService = Executors.newFixedThreadPool(1);//Response z executor service nazywa się Future
        //jest to promise co nas później czeka


        List<CallableTask> tasks = List.of(
                new CallableTask("Collable task one"),
                new CallableTask("Second super task"),
                new CallableTask("Super third task"));

        String futureList = executorService.invokeAny(tasks); //metoda invokeAny daje nam to żeby wykonał się do końca jeden najszybszy task


        System.out.println(futureList);

        executorService.shutdown();//kończy działanie wszystkich threads (wątków)
    }

}
