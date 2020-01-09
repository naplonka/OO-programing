package collection;

public class Student implements Comparable<Student>{
    private int id;
    private String studentName;

    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String toString() {
        return id + studentName;
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(that.id, this.id);
    }
    // Teraz sortujemy rosnąco, jeżeli zamienimy this z that to wtedy będziemy sortować rosnąco.
}
