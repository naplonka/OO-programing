package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyAndWriteArrayListRunner {
    public static void main(String[] args) {
        List list =  new CopyOnWriteArrayList<String>();

        //Thrads - 4
        list.add("Ant");
        list.add("Bat");
        list.add("Ex");
        list.add("Nat");

        for(Object element:list) {
            System.out.println(element);
        }
    }
}
