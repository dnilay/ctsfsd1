package comm.example;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Employee implements Comparable{
	private String employeeName;
	private String employeeId;
	private double salary;

	@Override
	public int compareTo(Object o) {
		int result=0;
		Employee employee=null;
		if(o instanceof Employee)
		{
			employee=(Employee)o;
		}
		if(this.getSalary()>employee.getSalary())
		{
			result= 1;
		}
		if(this.getSalary()<employee.getSalary())
		{
			result= -1;
		}
		 if(this.getSalary()==employee.getSalary())
		{
			result= 0;
		}
		return result;
		
	}

	
	


}
