package gnerics;

import java.util.List;

public class GenericsRunner {

    static Number sumOfNumberList(List<? extends Number > numbers){
        double sum = 0.0;
        for (Number number: numbers) {
            sum+= number.doubleValue();
        }
        return sum;
    }

    static void addACoupleOfValue(List<? super Number> numbers){
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);
    }

    public static void main(String[] args) {
        MyCustomList<String> list = new MyCustomList();

        list.addElemetn("Some");
        String value  = list.get(0);
        System.out.println(value);

        MyCustomList<Integer> list2 = new MyCustomList();
        list2.addElemetn((Integer.valueOf(2)));
        Integer number = list2.get(0);
        System.out.println(number);

    }
}
