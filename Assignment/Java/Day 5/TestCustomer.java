import java.util.Scanner;

class InvalidInputException extends Exception 
{
    public InvalidInputException(String message) 
    {
        super(message);
    }
}

class Customer 
{
    private String custNo;
    private String custName;
    private String category;

    public Customer(String custNo, String custName, String category) throws InvalidInputException 
    {

        if (!(custNo.startsWith("C") || custNo.startsWith("c"))) 
        {
            throw new InvalidInputException("Customer number must start with 'C' or 'c'");
        }

        if (custName.length() < 4) 
        {
            throw new InvalidInputException("Customer name must be at least 4 characters long");
        }

        if (!(category.equalsIgnoreCase("Platinum") || category.equalsIgnoreCase("Gold")|| category.equalsIgnoreCase("Silver"))) 
        {
            throw new InvalidInputException("Category must be 'Platinum', 'Gold', or 'Silver'");
        }

        this.custNo = custNo;
        this.custName = custName;
        this.category = category;
    }

    public String getCustNo() 
    {
        return custNo;
    }

    public String getCustName() 
    {
        return custName;
    }

    public String getCategory() 
    {
        return category;
    }
}

public class TestCustomer 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.print("Enter customer number (must start with 'C' or 'c'): ");
            String custNo = scanner.nextLine();

            System.out.print("Enter customer name (at least 4 characters long): ");
            String custName = scanner.nextLine();

            System.out.print("Enter category ('Platinum', 'Gold', or 'Silver'): ");
            String category = scanner.nextLine();

            Customer customer = new Customer(custNo, custName, category);
            System.out.println("\nCustomer Details:");
            System.out.println("Customer Number: " + customer.getCustNo());
            System.out.println("Customer Name: " + customer.getCustName());
            System.out.println("Category: " + customer.getCategory());
        } catch (InvalidInputException e) 
        {
            System.err.println("Invalid Input: " + e.getMessage());
        } finally 
        {
            scanner.close();
        }
    }
}
