import java.util.Scanner;

public class Array
{
    public static void main(String args[])
    {
        int n,sum=0,count=0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter  "+ n +"  array Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            sum=sum+a[i];
        }
        System.out.println("sum: "+sum);
        average=(float)sum/n;
        System.out.println("average: "+average);
         System.out.println("The values which are less than the average: ");
        for (int i=0;i<n;i++) 
        {
            if (a[i] < average) 
            {
                System.out.println(a[i]);
                count++;
            }
        }
        System.out.println("Number of values less than the average: " + count);
    }
}
