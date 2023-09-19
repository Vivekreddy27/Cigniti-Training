import java.util.Objects;

public class Employee1 {
    private int empId;
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    // Getter for empId
    public int getEmpId() {
        return empId;
    }

    // Setter for empId
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same memory address, objects are equal
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Different class or obj is null, objects are not equal
        }

        Employee employee = (Employee) obj;
        return empId == employee.empId && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alice");
        Employee emp2 = new Employee(1, "Alice");

        System.out.println("emp1 == emp2: " + (emp1 == emp2)); // Should print false
        System.out.println("emp1.equals(emp2): " + emp1.equals(emp2)); // Should print true

        System.out.println("emp1.hashCode(): " + emp1.hashCode()); // Hash code for emp1
        System.out.println("emp2.hashCode(): " + emp2.hashCode()); // Hash code for emp2
    }
}
