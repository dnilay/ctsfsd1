package comm.example;

import java.time.LocalDate;
import java.util.UUID;

public class TempEmployee extends Employee {
	
	private double hourlyRate;

	public TempEmployee() {
		super();
	}

	public TempEmployee(double hourlyRate) {
		super(UUID.randomUUID().toString(),"John",LocalDate.now());
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails()+" Hourly Rate: "+hourlyRate;
	}
	

}
