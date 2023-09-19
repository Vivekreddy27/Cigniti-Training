import java.io.*;

public class Emp implements Serializable 
{
    int empid;
    String ename;
    float sal;

    public Emp(int empid, String ename, float sal) 
    {
        this.empid = empid;
        this.ename = ename;
        this.sal = sal;
    }

    public String toString() 
    {
        return "Emp [empid=" + empid + ", ename=" + ename + ", sal=" + sal + "]";
    }

    public static void main(String[] args) 
    {
        Emp emp1 = new Emp(1, "John", 50000.0f);
        try (FileOutputStream fileOut = new FileOutputStream("emp.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) 
             {
            out.writeObject(emp1);
            System.out.println("Serialized Emp object and saved it to emp.ser");

        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        Emp emp2 = null;
        try (FileInputStream fileIn = new FileInputStream("emp.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) 
             {

            emp2 = (Emp) in.readObject();
            System.out.println("Deserialized Emp object from emp.ser");

        } 
        catch (IOException | ClassNotFoundException e) 
        {
            e.printStackTrace();
        }

        if (emp2 != null) {
            System.out.println("Deserialized Emp object: " + emp2);
        }
    }
}
