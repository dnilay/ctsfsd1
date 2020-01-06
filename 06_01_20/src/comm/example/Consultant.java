package comm.example;

import java.time.LocalDate;

public class Consultant extends Employee {
	
	private double consultationFees;

	public Consultant() {
		super();

	}

	public Consultant(String employeeId, String employeeName, LocalDate dateOfjoining, double consultationFees) {
		super(employeeId, employeeName, dateOfjoining);
		this.consultationFees=consultationFees;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails()+" consultation fees is "+consultationFees;
	}
	
	

}
