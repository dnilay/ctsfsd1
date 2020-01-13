package comm.example.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySqlConnectionFactory {
	private  Connection connection;
	 static MySqlConnectionFactory myConnection;
	
	public static Properties getConnectionproperties() throws IOException
	{
		InputStream in=new FileInputStream("mysql.properties");
		Properties prop=new Properties();
		prop.load(in);
		return prop;
	}
	private MySqlConnectionFactory()
	{
		
	}
	
	
	public static MySqlConnectionFactory getMyConnectionObject()
	{
		if(myConnection==null)
			
			return new MySqlConnectionFactory();
		
		else 
			return myConnection;
		
	}
	
	public  Connection getMyConnection() throws SQLException, IOException
	{
		Properties prop=getConnectionproperties();
		String url=prop.getProperty("jdbc.connection.url");
		String user=prop.getProperty("jdbc.connection.user");
		String password=prop.getProperty("jdbc.connection.password");
		//DriverManager.registerDriver(new org.h2.Driver());
		connection=DriverManager.getConnection(url,user,password);
		return connection;
	}

}
