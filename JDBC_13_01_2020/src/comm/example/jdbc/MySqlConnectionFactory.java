package comm.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionFactory {
	private  Connection connection;
	 static MySqlConnectionFactory myConnection;
	
	
	private MySqlConnectionFactory()
	{
		
	}
	
	
	public static MySqlConnectionFactory getMyConnectionObject()
	{
		if(myConnection==null)
			{
			return new MySqlConnectionFactory();
		}
		else {
			return myConnection;
		}
	}
	
	public  Connection getMyConnection() throws SQLException
	{
		
		//DriverManager.registerDriver(new org.h2.Driver());
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
		return connection;
	}

}
