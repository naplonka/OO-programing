package functionalprograming;

import java.util.List;
import java.util.Optional;

public class OptionalRunner {
    public static void main(String[] args) {
        List<Integer> integers = List.of(23,45,53,532);
        Optional<Integer> some = integers.stream().filter(n-> n%2==0).max((n1, n2) -> Integer.compare(n1,n2));
        System.out.println(some.get());
        //oprtional oznacza że coś może być albo nie
    }
}
