package functionalprograming;

import java.util.List;

public class FunctionalProgammingRunner {

    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Dog", "Cat");
        List<Integer> numbers = List.of(1, 5, 6, 7, 345, 324, 53);
        pringWithEP(list);
        printNumber(numbers);
        printBasicWithFiltering(list);
        printWithFilteringFP(list);
        printEvenNumber(numbers);

    }
    private static void printBasic (List<String> list){// tak robimu bez funkcjonalnego programowania to samo robi pringWithEP method
        for (String string:list) {
            System.out.println(string);
        }
    }

    private static void pringWithEP(List<String> list) {
        //stream oznacza że w kolejności
        list.stream().forEach(
                element -> System.out.println(element) //for each element from list zrób sout
        );
    }

    private static void  printNumber(List<Integer> numbersMethod) {
        numbersMethod.stream().forEach(integer -> System.out.println(integer));
    }

    private static void printBasicWithFiltering(List<String> list) {
        for (String string : list) {
            if (string.endsWith("at")) {
                System.out.println(string);
            }
        }
    }

    private static void printWithFilteringFP(List<String> list) {
        //stream oznacza że w kolejności
        list.stream()
                .filter(elemet -> elemet.endsWith("at"))
                .forEach(
                element -> System.out.println(element) //for each element from list zrób sout
        );
    }

    private static void printEvenNumber(List<Integer> numbers) {//parzyste wyświetli
        numbers.stream()
                .filter(number -> number % 2 ==0)
                .forEach(number -> System.out.println(number));
    }


}
