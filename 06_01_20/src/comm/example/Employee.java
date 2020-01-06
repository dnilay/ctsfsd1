package comm.example;

import java.time.LocalDate;

public class Employee {

	private String employeeId;
	private String employeeName;
	private LocalDate dateOfjoining;

	public Employee() {
		super();
	}

	public Employee(String employeeId, String employeeName, LocalDate dateOfjoining) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfjoining = dateOfjoining;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDate getDateOfjoining() {
		return dateOfjoining;
	}

	public void setDateOfjoining(LocalDate dateOfjoining) {
		this.dateOfjoining = dateOfjoining;
	}

	public String getDetails() {
		return "Name: " + getEmployeeName() + " EmployeeId: " + getEmployeeId() + " Joining date: "
				+ getDateOfjoining();
	}

}
