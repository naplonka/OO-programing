package orieted_programing;

public class BooksRunner {
    public static void main(String[] args) {
        Books book = new Books(123, "Object Oriented Programming with Java", "Ranga");
        book.addReview(new Review(10, "Great Book", 5));
        book.addReview(new Review(101, "Awesome", 5));

        System.out.println(book);

    }
}
