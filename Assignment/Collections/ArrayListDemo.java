import java.util.ArrayList;
import java.util.Iterator;

class Student {
    private ArrayList<String> names = new ArrayList<>();

    public void setNames() {
        // Implement code to scan names and add them to the ArrayList
        // For demonstration purposes, let's add some names manually
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
    }

    public void searchName(String name) {
        if (names.contains(name)) {
            System.out.println(name + " is in the list.");
        } else {
            System.out.println(name + " is not in the list.");
        }
    }

    public void searchName(int index) {
        if (index >= 0 && index < names.size()) {
            System.out.println("Student at index " + index + ": " + names.get(index));
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public void printNames() {
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void removeName(String stuName) {
        if (names.contains(stuName)) {
            names.remove(stuName);
            System.out.println(stuName + " has been removed from the list.");
        } else {
            System.out.println(stuName + " is not in the list.");
        }
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        Student student = new Student();

        // Set names
        student.setNames();

        // Search for a name
        student.searchName("Alice");

        // Search for a name at an index
        student.searchName(2);

        // Print all names
        System.out.println("All student names:");
        student.printNames();

        // Remove a name
        student.removeName("Bob");

        // Print the updated list
        System.out.println("Updated student names:");
        student.printNames();
    }
}
