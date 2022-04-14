package functionalprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOperationInStream {
    public static void main(String[] args) {

        IntStream.range(1,11).reduce(0, (n1, n2) -> n1+n2);

        List<Integer> cos = List.of(23,12,14,43);
        cos.stream().max((n1, n2) -> Integer.compare(n1, n2)).get();

        cos.stream().min((n1, n2)-> Integer.compare(n1, n2)).get();

        cos.stream().filter(e->e%2==0).collect(Collectors.toList()).forEach(e-> System.out.println(e));//collect(Collectors.toList() - bierze wsyzstkie wartości do listy
        IntStream.range(1, 11).map(e->e*e).boxed().collect(Collectors.toList()).forEach(e-> System.out.println(e)); //kwadrat z przedziału od 1 -10

    }
}
