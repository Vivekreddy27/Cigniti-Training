import java.util.Arrays;
import java.util.Scanner;

public class ReverseAndSortWords 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }
        String[] reversedWords = new String[5];
        for (int i = 0; i < 5; i++) 
        {
            reversedWords[i] = reverseWord(words[i]);
        }
        Arrays.sort(reversedWords);
        System.out.println("Sorted reversed words:");
        for (String word : reversedWords) 
        {
            System.out.println(word);
        }
        scanner.close();
    }
    private static String reverseWord(String word) 
    {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) 
        {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}
