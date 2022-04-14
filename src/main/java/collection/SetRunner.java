package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'C', 'A', 'Z', 'W', 'X', 'Z');

        Set<Character> tree = new TreeSet<>(characters);
        System.out.println(tree);// Nie duplikują się oraz są posortowane desc

        ((TreeSet<Character>) tree).floor('C');// pokazuje większe wartości od 3

        Set<Character> linkedHashSer = new LinkedHashSet<>(characters);
        System.out.println(linkedHashSer); // nie duplikują się, są posortowane według dodania do list

        Set<Character> hashSet = new HashSet<>(characters);
        System.out.println(hashSet); // nie są posortowane więc jeżeli nie dbamy o sortowanie używamy hash set bo jest najbardziej wydajna
    }
}
