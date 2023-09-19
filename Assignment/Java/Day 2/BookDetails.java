import java.util.Scanner;

class Book {
    private int bookNo;
    private String title;
    private String author;
    private float price;

    // Getter and Setter methods for bookNo
    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    // Getter and Setter methods for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter methods for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter methods for price
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Book object
        Book book = new Book();

        // Read inputs for the Book object
        System.out.print("Enter Book Number: ");
        book.setBookNo(scanner.nextInt());

        scanner.nextLine(); // Consume newline
        System.out.print("Enter Title: ");
        book.setTitle(scanner.nextLine());

        System.out.print("Enter Author: ");
        book.setAuthor(scanner.nextLine());

        System.out.print("Enter Price: ");
        book.setPrice(scanner.nextFloat());

        // Close the scanner
        scanner.close();

        // Display the Book details
        System.out.println("\nBook Details:");
        System.out.println("Book Number: " + book.getBookNo());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: $" + book.getPrice());
    }
}
