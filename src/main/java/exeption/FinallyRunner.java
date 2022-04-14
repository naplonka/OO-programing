package exeption;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {


            int[] numbers = {12, 3, 5, 3};

            int number = numbers[5];//tutaj jest bład

            System.out.println("before scanner close");
            // bez wyłapania wyjątku scanner.close() się nigdy nie wykona tzn że mwtoda scanner będzie trwała co prawadzi do wycieku pamięci

        scanner.close();
        } catch (Exception e){
            e.printStackTrace();
        } finally {//bez względu na to czy będzie wyjątek czy nie finally oznacza się zawsze się wykonane, że zawsze zamkniemy scanner
            System.out.println("Befire scanner close");
            if(scanner !=null) {
                scanner.close();
            }
        }
    }
}
//Możemy mieć try catch, try finally, ale nie samo try
