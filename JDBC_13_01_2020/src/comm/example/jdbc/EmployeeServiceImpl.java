package comm.example.jdbc;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;
	
	{
		dao=new EmployeeDAOImpl();
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

}
