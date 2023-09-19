import java.util.*;

public class ProductCollection 
{
    public class Product 
    {
        int pid;
        String pname;
        float price;

        public Product(int pid, String pname, float price) 
        {
            this.pid = pid;
            this.pname = pname;
            this.price = price;
        }
        public String toString() 
        {
            return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
        }
    }

    public static void main(String args[]) 
    {
        ProductCollection pc = new ProductCollection();
        Product p = pc.new Product(33, "HPLaptop", 4000);
        Product p1 = pc.new Product(555, "Book", 100);
        Product p2 = pc.new Product(111, "Mouse", 100);
        Product p3 = pc.new Product(444, "Printer", 20000);
        Product p4 = pc.new Product(222, "CPU", 30000);

        ArrayList prodList = new ArrayList();

        prodList.add(p);
        prodList.add(p1);
        prodList.add(p2);
        prodList.add(p3);
        prodList.add(p4);
        
        Iterator i = prodList.listIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
