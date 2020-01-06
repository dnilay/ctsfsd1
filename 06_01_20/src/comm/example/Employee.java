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
	
	public String getObjectType(Employee e)
	{
		if(e instanceof PermanentEmployee)
		{
			return "employee type is: permanent ";
		}
		else if(e instanceof TempEmployee)
		{
			return "employee type is: temporary ";
		}
		else if(e instanceof Consultant)
		{
			return "employee type is: consultant ";
		}
		else
		{
			return "employee type is: unknown";
		}
	}
	
	public String getDetails() {
		return getObjectType(this)+ "Name: " + getEmployeeName() + " EmployeeId: " + getEmployeeId() + " Joining date: "
				+ getDateOfjoining();
	}

}
