import java.util.*;

class Product
{
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) 
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String toString()
    {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}

public class ProdCollect
{
    public static void main(String[] args) 
    {
        ArrayList prodList = new ArrayList();

        prodList.add(new Product(1, "Laptop", 999.99));
        prodList.add(new Product(2, "Smartphone", 599.99));
        prodList.add(new Product(3, "Headphones", 49.99));
        prodList.add(new Product(4, "printer", 39.99));
        prodList.add(new Product(5, "tablet", 299.99));

        Iterator i = prodList.iterator();
        while (i.hasNext()) 
        {
            System.out.println(i.next());
        }
    }
}