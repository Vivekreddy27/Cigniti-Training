import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {
    private int empNo;
    private String empName;
    private int empBasic;

    public Employee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpBasic() {
        return empBasic;
    }
}

public class WriteEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter employee details
        System.out.print("Enter Employee Number: ");
        int empNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Employee Basic Salary: ");
        int empBasic = scanner.nextInt();

        // Create an Employee object with the entered details
        Employee employee = new Employee(empNo, empName, empBasic);

        // Write the employee details to the file emp.txt
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("emp.txt"))) {
            outputStream.writeObject(employee);
            System.out.println("Employee details have been written to emp.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read and display employee details from the file emp.txt
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("emp.txt"))) {
            Employee readEmployee = (Employee) inputStream.readObject();
            System.out.println("\nEmployee Details from emp.txt:");
            System.out.println("Employee Number: " + readEmployee.getEmpNo());
            System.out.println("Employee Name: " + readEmployee.getEmpName());
            System.out.println("Employee Basic Salary: " + readEmployee.getEmpBasic());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
