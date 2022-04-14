package concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
    public static void main(String[] args) {
//        Map<Character, LongAdder> ocurances = new Hashtable<>(); teraz ten obiekt nie jest wątkowo bezpieczny żeby to zrobić używamy ConccurentMap
        ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();

        //Kazdy region ma osobny lock w ConcurrencyHashMap
        String str = "ABCS ACDS ABDC";
        for(char charcatoer:str.toCharArray()) {
            occurances.computeIfAbsent(charcatoer, ch -> new LongAdder()).increment();// ta jedna linia zastępuje cały kod
//            LongAdder longAdder = ocurances.get(charcatoer);
//            if(longAdder == null){
//                longAdder = new LongAdder();
//            }
//            longAdder.increment();
//            ocurances.put(charcatoer, longAdder);
//        }

        System.out.println(occurances);

    }}

}
