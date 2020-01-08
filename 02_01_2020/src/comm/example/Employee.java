package comm.example;

public class Employee {

	private int employeeId;
	private String employeeName=null;
	private double salary;


//parameterized constructor
	public Employee(int employeeId, String employeeName, double salary) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

//create a new employee
	public static Employee createEmployee(int employeeId, String employeeName, double salary) {
		return new Employee(employeeId, employeeName, salary);
	}

	public String displayEmployeeDetails() {
		return "Employee ID: " + employeeId + " Employee Name: " + employeeName + " Salary: " + salary;
	}

}
