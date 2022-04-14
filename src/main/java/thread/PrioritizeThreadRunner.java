package thread;
/*Task 1 kick off
Task 2 kick off
Task1 started

Task 2 started
101 102 10 103 11 104 12 13 14 15 105
Task 2 is Done
106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130
Task 1 is done
Task 3 kick off przez że przed task 3 dodalismy task1.join(), task3 zacząl się wykonywać w momencie kiedy tamten się skończył
20 21 22 23 24 25 26 27 28 29 30 31 32 33 34
Task 3 done
Main Done

*/
//BLOCKED/WAITING kiedy czekamy na jakieś dane



public class PrioritizeThreadRunner {
    public static void main(String[] args) throws InterruptedException {
        //Task1
        System.out.println("Task 1 kick off");
        Task1 task1 = new Task1();// task jest gotowy ale nie uruchamiamy go na razie, zanim się nie zacznie ekzekucja thread jest w stanie NEW
        task1.setPriority(1); //It's just request, może nie być wykonany :D, 1 znaczy namniejszą, 10 największą
        task1.start();
        //Kiedy task jest skończony jest TERMINATED/DEAD

        System.out.println("Task 2 kick off");
        //Task2
        Task2 task2 = new Task2();
        Thread task2Threas = new Thread(task2);
        task2Threas.setPriority(10);
        task2Threas.start();

        //wait for taks 1 to complete
        task1.join();
        task2Threas.join();
        //


        //Task3
        System.out.println("Task 3 kick off");
        for (int i = 20; i <= 34; i++)
            System.out.print(i + " ");

        System.out.print("\nTask 3 done");
        System.out.println("\nMain Done");
    }
}
