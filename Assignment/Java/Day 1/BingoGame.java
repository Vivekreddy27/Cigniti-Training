public class BingoGame 
{
    public static void main(String[] args) 
    {
        if (args.length != 1) 
        {
            System.out.println("Usage: BingoGame <number>");
            return;
        }
        int userInput = Integer.parseInt(args[0]);
        int[] numbers = { 15, 7, 42, 28, 5 };
        boolean found = false;
        for (int number : numbers) 
        {
            if (userInput == number) 
            {
                found = true;
                break;
            }
        }
        if (found) 
        {
            System.out.println("BINGO");
        } 
        else 
        {
            System.out.println("The number is not in the array.");
        }
    }
}
