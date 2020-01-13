package collection.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}

public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        //Queue<String> queue = new PriorityQueue<>(new StringComparator()); - uwzgledni klase StringComparator i będzie twrzyly się kolejki według kolejności co dodaliśmy

        queue.addAll(List.of("Apple", "Banana", "Orange", "Cat"));
        System.out.println(queue);
        queue.poll(); //wykonuje działa z kolejki => wynikiem będzie "Apple", jeżeli nie ustalimy kolejności, wykonują się ona z naturalną kolejności.

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
//"Cat" wykona się przed "Orange" bo defaultowo mamy naturalną kolejność
        System.out.println(queue); // wynik to "Banana, "Orange" ponieważ Apple już się wykonało
        // Jeżeli chcemy żeby kolejkowało nam tak dodaliśmy wtedy musimy dodać Comparator odpowiada za to klasa w/w StringComparator
    }
}
