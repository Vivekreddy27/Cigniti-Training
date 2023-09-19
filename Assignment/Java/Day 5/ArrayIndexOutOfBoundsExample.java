public class ArrayIndexOutOfBoundsExample 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[10];

        try 
        {
            arr[11] = 42;
        } catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
        System.out.println("Program continues after the exception.");
    }
}
