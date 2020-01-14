package functionalprograming;

import java.util.List;

public class FpNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,45,32,56,345);

        int sum = numbers.stream().filter(number -> number % 2 ==1).reduce(//weż liczby nieparzyste
                0,
                (number1, number2) -> number1 + number2);//zaczynając od 0, weż każde pare liczb i je do siebie dodaj
        System.out.println(fpSum(numbers));
//        System.out.println(normalSum(numbers));
    }

    private static int normalSum(List<Integer> integers) {
        int sum = 0;
        for (Integer number: integers){
            sum+=number;//value of sum się zmienia = mutation
        }
        return sum;
    }

    private static int fpSum(List<Integer> integers) {
        int sum = integers.stream().reduce(//reduce - zmniejszamy w prostszy sposób
                0,
                (number1, number2) -> {
                    System.out.println(number1 + " " + number2);
                    return number1 + number2;
                });
        return sum;
    }


}
