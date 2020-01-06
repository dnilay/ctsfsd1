package comm.example;

import java.time.LocalDate;

public class PermanentEmployee extends Employee {
	private double salary;

	public PermanentEmployee()
	{
		super();
	}

	public PermanentEmployee(String employeeId, String employeeName, LocalDate dateOfjoining,double salary) {
		super(employeeId, employeeName, dateOfjoining);
		this.salary=salary;
		
	}

	@Override
	public String getDetails() {
		
		return super.getDetails()+" Salary: "+salary;
	}
	
	
	
}
