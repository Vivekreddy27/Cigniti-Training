import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Student {
    private HashMap<String, String> empNames = new HashMap<>();

    public void setNames() {
        // Implement code to set names in the HashMap
        // For demonstration purposes, let's add some names manually
        empNames.put("101", "Alice");
        empNames.put("102", "Bob");
        empNames.put("103", "Charlie");
        empNames.put("104", "David");
    }

    public void printNames() {
        for (Map.Entry<String, String> entry : empNames.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public void getName(String key) {
        if (empNames.containsKey(key)) {
            System.out.println("Name for Roll Number " + key + ": " + empNames.get(key));
        } else {
            System.out.println("Roll Number " + key + " not found.");
        }
    }

    public void printNamesKeySet() {
        Set<String> keys = empNames.keySet();
        for (String key : keys) {
            String name = empNames.get(key);
            System.out.println("Roll Number: " + key + ", Name: " + name);
        }
    }

    public void printSize() {
        int size = empNames.size();
        System.out.println("Size of HashMap: " + size);
    }

    public void remove(String key) {
        if (empNames.containsKey(key)) {
            empNames.remove(key);
            System.out.println("Roll Number " + key + " has been removed from the HashMap.");
        } else {
            System.out.println("Roll Number " + key + " not found.");
        }
    }
}

public class TestHashMap {
    public static void main(String[] args) {
        Student student = new Student();

        // Set names
        student.setNames();

        // Print all names
        System.out.println("All student names:");
        student.printNames();

        // Get a name by key
        student.getName("102");

        // Print all names using keySet
        System.out.println("All student names using keySet:");
        student.printNamesKeySet();

        // Print the size of the HashMap
        student.printSize();

        // Remove a name by key
        student.remove("103");

        // Print the updated list
        System.out.println("Updated student names:");
        student.printNames();
    }
}
