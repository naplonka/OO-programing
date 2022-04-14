package thread;
/*Task 1 kick off
Task 2 kick off
Task1 started
Task 3 kick off

Task 2 started
tutaj widzimy że task 1 (liczba 101_ RUNNING, kiedy zaczyna się task 2 (liczba 20) w tym momencie task1 ma stan RUNNABLE, a task2 RUNNING
101 20 10 21 102 22 11 23 103 24 12 25 104 26 13 27 105 28 29 14 30 106 31 15 32 107 108 109 33 34
Task 2 is Done

Task 3 done
Main Done
110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130
Task 1 is done

*/
//BLOCKED/WAITING kiedy czekamy na jakieś dane


class Task1 extends Thread {
    public void run() {
        System.out.println("Task1 started");
        for (int i = 101; i <= 130; i++)
        System.out.print(i +" ");

        System.out.println("\nTask 1 is done ");
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        //Task2
        System.out.println("\nTask 2 started");
        for (int i = 10; i <= 15; i++)
            System.out.print( i +" ");
        System.out.println("\nTask 2 is Done ");
    }
}

public class ThreadBasicRunne {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task 1 kick off");
        Task1 task1 = new Task1();// task jest gotowy ale nie uruchamiamy go na razie, zanim się nie zacznie ekzekucja thread jest w stanie NEW
        task1.start();
        //Kiedy task jest skończony jest TERMINATED/DEAD

        System.out.println("Task 2 kick off");
        //Task2
        Task2 task2 = new Task2();
        Thread task2Threas = new Thread(task2);
        task2Threas.start();


        //Task3
        System.out.println("Task 3 kick off");
        for (int i = 20; i <= 34; i++)
            System.out.print(i + " ");

        System.out.print("\nTask 3 done");
        System.out.println("\nMain Done");
    }
}
