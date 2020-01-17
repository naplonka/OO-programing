package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();//Executor service nie zacznie wykonywać 2 taska jeżeli 1 nie jestem zakończony
        ExecutorService executorService = Executors.newFixedThreadPool(2); //jeżeli chcemy żeby działało w wielu wątkach, w nawiasie zapisujemy w ilu wątkach
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

        //Task3
        System.out.println("Task 3 kick off");
        for (int i = 20; i <= 34; i++)
            System.out.print(i + " ");

        System.out.print("\nTask 3 done");
        System.out.println("\nMain Done");
        executorService.shutdown();
    }
}
