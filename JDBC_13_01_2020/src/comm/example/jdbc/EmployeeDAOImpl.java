package comm.example.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
	private MySqlConnectionFactory facctory = null;
	private Connection connection = null;
	private Statement statement = null;
	List<Employee> list = null;

	{
		facctory = MySqlConnectionFactory.getMyConnectionObject();
		try {
			connection = facctory.getMyConnection();
			list = new ArrayList<Employee>();
		} catch (SQLException e) {

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {

		statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select id,first_name,last_name,salary from employees");
		while (resultSet.next()) {

			list.add(new Employee(resultSet.getInt("id"),
					resultSet.getString("first_name"),
					resultSet.getString("last_name"),
					resultSet.getDouble("salary")));

		}

		return list;
	}

}
