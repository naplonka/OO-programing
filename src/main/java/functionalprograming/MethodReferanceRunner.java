package functionalprograming;

import java.util.List;
import java.util.function.Predicate;
// Normalne programowanie (niefukcyjne) tzn imperatywne

public class MethodReferanceRunner {

    public static void print(Integer integer){
        System.out.println(integer);
    }
    public static void main(String[] args) {


        List.of("Ant", "Dog", "Bat", "Elephant").stream()
                .map(s->s.length())
                .forEach(s-> System.out.println(s));

        List.of("Ant", "Dog", "Bat", "Elephant").stream()
                .map(s->s.length())//String::length
                .forEach(System.out::println);
                //.forEach(MethodRferanceRunner::print) w nawiasie mamy napierw nazwe klasy potem metody, używamy referencji metody
        //Nie tylko statyczne metody ale również instance method

        Predicate<Integer> evenPredicate = getIntegerPredicate(0);
        Predicate<Integer> addPredicate = n -> n % 2 == 1;
        Integer max = List.of(23,45,54,34).stream()
                .filter(evenPredicate)
                .max((n1, n2)->Integer.compare(n1, n2))
                .orElse(0);
        System.out.println(max);

        Integer maxSimple = List.of(23,45,54,34).stream()
                .filter(evenPredicate)
                .max(Integer::compare)// to jest to samo co wyżej: (n1, n2)->Integer.compare(n1, n2)
                .orElse(0);
        System.out.println(maxSimple);

        //1. Storing interfaces in variables to jest Predicate<Integer> evenPredicate = n -> n % 2 == 0; definicja kodu w jej instancji
        //2. Passing Functions to methods to jest
        //3. Returning Functions from methods to jest private static Predicate<Integer> getIntegerPredicate(int i) {
        //        return n -> n % 2 == i;
        //    }
        //
    }

    private static Predicate<Integer> getIntegerPredicate(int i) {
        return n -> n % 2 == i;
    }
}
