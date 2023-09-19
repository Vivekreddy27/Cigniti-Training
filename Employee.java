import java.util.*;

public class Employee {
    private int empId;
    private String name;

    public Employee(int empId, String name) 
    {
        this.empId = empId;
        this.name = name;
    }

    // Getter for empId
    public int getEmpId() 
    {
        return empId;
    }

    // Setter for empId
    public void setEmpId(int empId) 
    {
        this.empId = empId;
    }

    // Getter for name
    public String getName() 
    {
        return name;
    }

    // Setter for name
    public void setName(String name) 
    {
        this.name = name;
    }

    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true; // Same memory address, objects are equal
        }
        if (obj == null || getClass() != obj.getClass()) 
        {
            return false; // Different class or obj is null, objects are not equal
        }

        Employee employee = (Employee) obj;
        return empId == employee.empId && Objects.equals(name, employee.name);
    }

    public int hashCode() 
    {
        return Objects.hash(empId);
    }

    public static void main(String[] args) 
    {
        // Create an ArrayList to store employees
        List<Employee> employeeList = new ArrayList<>();

        // Add employees to the ArrayList
        employeeList.add(new Employee(1, "Alice"));
        employeeList.add(new Employee(2, "Bob"));
        employeeList.add(new Employee(3, "Charlie"));
        System.out.println(employeeList);
        // Print the employee details from the ArrayList
        for (Employee employee : employeeList) 
        {
            System.out.println("Emp ID: " + employee.getEmpId() + ", Name: " + employee.getName());
        }
    }
}
