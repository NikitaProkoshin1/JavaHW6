package JavaHW6;

public class Book {
    String bookName;
    String authorName;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book book1 = new Book ("Незнайка на Луне", "Н.Н. Носов");
        Book book2 = new Book ("Евгений Онегин", "А.С. Пушкин");
        Book book3 = new Book ("Горе от ума", "А.С. Грибоедов");
        Book book4 = new Book ("Война и мир том 1", "Л.Н. Толстой");

        System.out.println(book1);

    }
}
