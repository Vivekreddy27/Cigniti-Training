import java.util.*;

public class A
{
    public static void main(String args[])
    {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);

        Iterator i = al.listIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}