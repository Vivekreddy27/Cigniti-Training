import java.io.File;

public class DirectoryList {
    public static void main(String[] args) {
        // Read a directory name from the user
        String directoryName = System.console().readLine("Enter directory name: ");
        
        // Create a File object for the specified directory
        File directory = new File(directoryName);

        // Check if the directory exists
        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Files and subdirectories in " + directoryName + ":");
            // List all files and subdirectories in the specified directory
            String[] fileList = directory.list();
            for (String fileOrDir : fileList) {
                System.out.println(fileOrDir);
            }
        } else {
            System.out.println("Directory does not exist.");
        }
    }
}
