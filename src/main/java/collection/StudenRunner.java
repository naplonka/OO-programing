package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudenRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Ranga"),
                new Student(100, "Adam"));
        List<Student> students1 = new ArrayList<>(students);

        System.out.println(students1);
        Collections.sort(students1);
        // Bierze rosnąco
        System.out.println("Asc" + students1);

        Collections.sort(students1, new DescendingStudentComparator());// Wykorzystuje implementacje tej samej metody: będzie sortować malejąco desc

        //Możemy to zapisać inaczej
        students1.sort(new DescendingStudentComparator()); //Wynik będzie taki sam
        System.out.println("Desc " + students1);
    }

    //Sortowanin kolekcji. Poprzez implementacjie collections możemy stworzyć wiele rodzajów implementacji metody, w tym przypadku sortowania.


}
