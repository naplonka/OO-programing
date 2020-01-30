package tipsandtrics.anonymous_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String> {// nie musimy stosować tej klasy żeby zrobić porównanie

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());// porównujemy długość słów
    }
}

public class AnonymousClassRunner {
    public static void main(String[] args) {

        List<String> animals =  new ArrayList<>(List.of("Ant", "Elephant", "Cat", "Dogy", "Monkey"));
        Collections.sort(animals, new Comparator<String>() {// zamiast tworzyć klase stworzyliśmy od razu instancje tej klasy
            // ta klasa nie ma nazwy więc jest anonimowa klasa
            //Klase anonimową stworzymy jeżeli wiemy że nieużyjemy tej metody nigdzie więcej
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

//        Collections.sort(animals, new LengthComparator()); bieżemy new LengthComparator żeby nam posortował według dłogości
        System.out.println(animals);
        //output [Ant, Cat, Dogy, Monkey, Elephant]
    }
}
