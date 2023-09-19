import java.util.ArrayList;

public class ArrayListExample
{
    public static void main(String args[])
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vivek");
        names.add("Rohit");
        names.add("preethi");
        names.add("Mithil");
        names.add("Sampu");
        for (String name : names) 
        {
           System.out.println(name);
        }
    }
}

