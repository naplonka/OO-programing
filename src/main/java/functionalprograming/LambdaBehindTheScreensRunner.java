package functionalprograming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }
}

class EvenNumberConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}

class NumberSquereFunction implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer*integer;
    }
}

public class LambdaBehindTheScreensRunner {
    public static void main(String[] args) {

        List.of(23, 35, 45, 32, 55, 2, 10).stream()
                .filter(n -> n % 2 == 0)
                .map(n-> n*n)// jest implementacja Function, w której jest metoda apply, która mówi weź input i wyrzuć output
                .forEach(e -> System.out.println(e));

        List.of(23, 35, 45, 32, 55, 2, 10).stream()
                .filter(new EvenNumberPredicate())
                .map(new NumberSquereFunction())
                .forEach(new EvenNumberConsumer());//Tutaj też utworzylam klase która implementuje Consumer, która posiada metode accept
        //wforEah tworzymy accept method dla interfejsu Consumer


    }
    //Funcji powyżej mają ten sam output, lambda uzywa implemnetacji rturns if test passed or not
}
