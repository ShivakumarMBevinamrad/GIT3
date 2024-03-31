class Employee {
    protected String name;
    protected int employeeId;
    protected double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Creating Employee object
        Employee employee = new Employee("John Doe", 1001, 50000);
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();

        System.out.println();

        DevOpsEngineer devOpsEngineer = new DevOpsEngineer("Alice Smith", 2002, 60000, 5000);
        System.out.println("DevOps Engineer Details:");
        devOpsEngineer.displayEmployeeDetails();
    }
}