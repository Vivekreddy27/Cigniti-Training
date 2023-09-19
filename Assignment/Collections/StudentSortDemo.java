import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student otherStudent) {
        // Compare students based on their names
        return this.name.compareTo(otherStudent.name);
    }
}

public class StudentSortDemo {
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

        // Call the sort() method of the Collections class to sort the student data
        Collections.sort(studentList);

        // Print all student data (sorted by name)
        System.out.println("\nSorted Student Data:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
