import java.util.Scanner;
import java.util.Scanner;

class Book {
    private int bookNo;
    private String title;
    private String author;
    private float price;
    private static int bookCount = 0; // Static member to count the number of books

    static 
    {
        // Static block to initialize bookCount to zero
        bookCount = 0;
    }

    public Book(int bookNo, String title, String author, float price) 
    {
        if (title.length() < 4) 
        {
            System.out.println("Error: Title must have at least 4 characters.");
            return;
        }
        if (price < 1 || price > 5000) 
        {
            System.out.println("Error: Price must be in the range 1 to 5000.");
            return;
        }
        
        this.bookNo = bookNo;
        this.title = title;
        this author = author;
        this.price = price;

        // Increment bookCount when a new Book object is created
        bookCount++;
    }

    // Getter and Setter methods for bookNo
    public int getBookNo() 
    {
        return bookNo;
    }

    public void setBookNo(int bookNo) 
    {
        this.bookNo = bookNo;
    }

    // Getter and Setter methods for title
    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    // Getter and Setter methods for author
    public String getAuthor() 
    {
        return author;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }

    // Getter and Setter methods for price
    public float getPrice() 
    {
        return price;
    }

    public void setPrice(float price) 
    {
        this.price = price;
    }

    // Getter method for bookCount
    public static int getBookCount() 
    {
        return bookCount;
    }

    // Override toString() method to print book details
    @Override
    public String toString()
    {
        return "Book Number: " + bookNo + "\nTitle: " + title + "\nAuthor: " + author + "\nPrice: $" + price;
    }
}

public class BookDetails4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3]; // Create an array of 3 Book objects

        for (int i = 0; i < 3; i++) 
        {
            System.out.println("Enter details for Book " + (i + 1) + ":");

            // Read inputs for the Book object
            System.out.print("Enter Book Number: ");
            int bookNo = scanner.nextInt();

            scanner.nextLine(); // Consume newline
            System.out.print("Enter Title: ");
            String title = scanner.nextLine();

            System.out.print("Enter Author: ");
            String author = scanner.nextLine();

            System.out.print("Enter Price: ");
            float price = scanner.nextFloat();

            // Create a Book object with validation
            Book book = new Book(bookNo, title, author, price);

            // Check if the Book object was created successfully
            if (book != null) 
            {
                // Add the Book object to the array
                books[i] = book;
            }
        }

        // Display the details of all the books in the array
        System.out.println("\nDetails of all Books:");
        for (int i = 0; i < 3; i++) 
        {
            System.out.println("Book " + (i + 1) + ":");
            System.out.println(books[i].toString());
        }

        // Display the total number of books
        System.out.println("\nTotal Number of Books: " + Book.getBookCount());


        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3]; // Create an array of 3 Book objects

        for (int i = 0; i < 3; i++) 
        {
            System.out.println("Enter details for Book " + (i + 1) + ":");

            // Read inputs for the Book object
            System.out.print("Enter Book Number: ");
            int bookNo = scanner.nextInt();

            scanner.nextLine(); // Consume newline
            System.out.print("Enter Title: ");
            String title = scanner.nextLine();

            System.out.print("Enter Author: ");
            String author = scanner.nextLine();

            System.out.print("Enter Price: ");
            float price = scanner.nextFloat();

            // Create a Book object with validation
            Book book = new Book(bookNo, title, author, price);

            // Check if the Book object was created successfully
            if (book != null) 
            {
                // Add the Book object to the array
                books[i] = book;
            }
        }

        // Display the details of all the books in the array
        System.out.println("\nDetails of all Books:");
        for (int i = 0; i < 3; i++) 
        {
            System.out.println("Book " + (i + 1) + ":");
            System.out.println(books[i].toString());
        }

        // Display the total number of books
        System.out.println("\nTotal Number of Books: " + Book.getBookCount());

        // Search for a book by book number
        System.out.print("\nEnter a Book Number to search: ");
        int searchBookNo = scanner.nextInt();
        boolean bookFound = false;

        for (int i = 0; i < 3; i++) {
            if (books[i] != null && books[i].getBookNo() == searchBookNo) 
            {
                // Book found, display its details
                System.out.println("\nBook Found:");
                System.out.println(books[i].toString());
                bookFound = true;
                break;
            }
        }

        if (!bookFound) 
        {
            // Book not found, display an error message
            System.out.println("\nBook with Book Number " + searchBookNo + " not found.");
        }

        // Close the scanner
        scanner.close();
    }
}
