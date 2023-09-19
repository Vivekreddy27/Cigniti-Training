public class Employee {
    private int employeeId;
    private String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    // Getters and setters (omitted for brevity)

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same memory address, objects are equal
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Different class or obj is null, objects are not equal
        }

        Employee employee = (Employee) obj;
        return employeeId == employee.employeeId && name.equals(employee.name);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alice");
        Employee emp2 = new Employee(1, "Alice"); // Same values, different memory address

        System.out.println("emp1 == emp2: " + (emp1 == emp2)); // Should print false
        System.out.println("emp1.equals(emp2): " + emp1.equals(emp2)); // Should print true
    }
}
