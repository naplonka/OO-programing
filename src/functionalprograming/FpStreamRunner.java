package functionalprograming;

import java.util.List;
import java.util.stream.IntStream;

public class FpStreamRunner {
    public static void main(String[] args) {

        List<Integer> number = List.of(3,4,54,53,34,55,3);

//        number.stream().sorted().forEach(e-> System.out.println(e));

//        number.stream().distinct().forEach(e-> System.out.println(e));//nie powtarzają się

//        number.stream().distinct().map(e->e*e);

        IntStream stream = IntStream.range(1, 10).map(e->e*e);
        stream.map(e->e*e).forEach(e-> System.out.println(e));
//        System.out.println(stream.forEach(value -> int value));

        List<String> strings = List.of("Apple", "Bat", "Ant");
        strings.stream().map(e-> e.toLowerCase()).forEach(e-> System.out.println(e));

        strings.stream().map(e->e.length()).forEach(e-> System.out.println(e));
    }
}
