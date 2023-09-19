import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Compare students based on their names
        return student1.getName().compareTo(student2.getName());
    }
}

public class StudentSortDemo1 {
    public static void main(String[] args) {
        // Create an ArrayList of type Student
        ArrayList<Student> studentList = new ArrayList<>();

        // Store 5 student data in the ArrayList
        studentList.add(new Student(101, "Alice"));
        studentList.add(new Student(102, "Bob"));
        studentList.add(new Student(103, "Charlie"));
        studentList.add(new Student(104, "David"));
        studentList.add(new Student(105, "Eve"));

        // Print all student data (unsorted)
        System.out.println("Unsorted Student Data:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Sort the student data using the StudentNameComparator
        Collections.sort(studentList, new StudentNameComparator());

        // Print all student data (sorted by name)
        System.out.println("\nSorted Student Data:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
