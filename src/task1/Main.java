package task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("Александр Сергеевич");
        Author author1 = new Author("Лев Николаевич");
        Book[] books = new Book[2];

        books[0] = new Book("Евгений Онегин", author);
        books[1] = new Book("Война и мир", author1);

        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println(Arrays.toString(books));
    }
}
