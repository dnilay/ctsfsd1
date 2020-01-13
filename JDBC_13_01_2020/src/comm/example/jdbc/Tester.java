package comm.example.jdbc;

import java.sql.SQLException;
import java.util.List;

public class Tester {
	private EmployeeService service;

	public static void main(String[] args) throws SQLException {

		Tester tester = new Tester();
		tester.service = new EmployeeServiceImpl();
		List<Employee> list=tester.service.getAllEmployees();


System.out.println("EMPLOYEEID\t"+"FIRST_NAME\t"+"LAST_NAME\t"+"SALARY");
		list.forEach(e->{
			System.out.println(e.getEmployeeId().toString()+"\t\t"+e.getFirstName()+"\t\t"+e.getLastName()+"\t\t"+e.getSalary().toString());
		});

	}

}
