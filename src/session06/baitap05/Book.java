package session06.baitap05;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private double price;

    public Book(String bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Giá: " + price);
    }

}
