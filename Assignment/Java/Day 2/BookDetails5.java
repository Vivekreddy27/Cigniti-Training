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

class EngineeringBook extends Book {
    private String category;

    public EngineeringBook(int bookNo, String title, String author, float price, String category) {
        super(bookNo, title, author, price);
        this.category = category;
    }

    // Getter and Setter methods for category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

public class BookDetails {
    public static void main(String[] args) {
        // Create an EngineeringBook object and test it
        EngineeringBook engBook = new EngineeringBook(101, "Introduction to Java", "John Doe", 49.99f, "Programming");
        
        // Display the details of the EngineeringBook
        System.out.println("Engineering Book Details:");
        System.out.println("Book Number: " + engBook.getBookNo());
        System.out.println("Title: " + engBook.getTitle());
        System.out.println("Author: " + engBook.getAuthor());
        System.out.println("Price: $" + engBook.getPrice());
        System.out.println("Category: " + engBook.getCategory());
        
        // Display the total number of books
        System.out.println("\nTotal Number of Books: " + Book.getBookCount());
    }
}
