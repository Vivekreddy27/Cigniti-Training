import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CopyFile <sourceFileName> <destinationFileName>");
            return;
        }

        String sourceFileName = args[0];
        String destinationFileName = args[1];

        File sourceFile = new File(sourceFileName);
        File destinationFile = new File(destinationFileName);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        if (destinationFile.exists()) {
            System.out.print("Destination file already exists. Want to overwrite? (yes/no): ");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String userInput = reader.readLine().trim();
                if (!userInput.equalsIgnoreCase("yes")) {
                    System.out.println("File copy operation canceled.");
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
