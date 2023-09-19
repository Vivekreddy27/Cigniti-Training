import java.io.*;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        // Read 5 lines from the user
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter line " + (i + 1) + ": ");
            lines[i] = scanner.nextLine();
        }
        scanner.close();

        // Write the lines to a file named letter.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("letter.txt"))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Lines have been written to letter.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display the size of the file
        File file = new File("letter.txt");
        long fileSize = file.length();
        System.out.println("Size of the file letter.txt: " + fileSize + " bytes");

        // Read and display the contents of the file
        try (BufferedReader reader = new BufferedReader(new FileReader("letter.txt"))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Delete the letter.txt file
        if (file.delete()) {
            System.out.println("File letter.txt has been deleted.");
        } else {
            System.out.println("Failed to delete file letter.txt.");
        }
    }
}
