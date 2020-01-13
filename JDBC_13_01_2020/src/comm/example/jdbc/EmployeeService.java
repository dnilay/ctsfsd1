package comm.example.jdbc;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {
	public List<Employee> getAllEmployees() throws SQLException;

}
