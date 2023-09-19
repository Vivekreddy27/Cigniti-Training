import java.util.Random;

// Abstract Medicine class
abstract class Medicine 
{
    private double price;
    private String expiryDate;

    public Medicine(double price, String expiryDate) 
    {
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public abstract void displayLabel(); // Abstract method

    public void getDetails() 
    {
        System.out.println("Price: $" + price);
        System.out.println("Expiry Date: " + expiryDate);
    }
}

// Tablet class derived from Medicine
class Tablet extends Medicine 
{
    public Tablet(double price, String expiryDate) 
    {
        super(price, expiryDate);
    }

    @Override
    public void displayLabel() 
    {
        System.out.println("Tablet: Store in a cool dry place.");
    }
}

// Syrup class derived from Medicine
class Syrup extends Medicine 
{
    public Syrup(double price, String expiryDate) 
    {
        super(price, expiryDate);
    }

    @Override
    public void displayLabel() 
    {
        System.out.println("Syrup: Shake well before use.");
    }
}

// Ointment class derived from Medicine
class Ointment extends Medicine 
{
    public Ointment(double price, String expiryDate) 
    {
        super(price, expiryDate);
    }

    @Override
    public void displayLabel() 
    {
        System.out.println("Ointment: For external use only.");
    }
}

public class TestMedicine 
{
    public static void main(String[] args) 
    {
        // Create an array of Medicine references
        Medicine[] medicines = new Medicine[5];

        // Generate random medicine types and create objects
        Random random = new Random();
        for (int i = 0; i < 5; i++) 
        {
            int randomMedicineType = random.nextInt(3) + 1;
            double price = 10 + random.nextDouble() * 90; // Random price between 10 and 100
            String expiryDate = "20/12/2023"; // Sample expiry date

            switch (randomMedicineType) 
            {
                case 1:
                    medicines[i] = new Tablet(price, expiryDate);
                    break;
                case 2:
                    medicines[i] = new Syrup(price, expiryDate);
                    break;
                case 3:
                    medicines[i] = new Ointment(price, expiryDate);
                    break;
            }
        }

        // Display medicine details and labels
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("\nMedicine " + (i + 1) + " Details:");
            medicines[i].getDetails();
            medicines[i].displayLabel();
        }
    }
}
