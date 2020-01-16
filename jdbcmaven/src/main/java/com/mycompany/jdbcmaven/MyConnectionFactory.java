package com.mycompany.jdbcmaven;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class MyConnectionFactory {
	private Connection connection;
	private static MyConnectionFactory factory;

	private MyConnectionFactory() {
		super();
	}

	public static MyConnectionFactory getFactoryObject()
	{
		if(factory==null)
		{
			factory=new MyConnectionFactory();
		}
		return factory;
	}
	
	
	public Connection getMyConnection() throws IOException, SQLException
	{
		InputStream in=new FileInputStream("mysql.properties");
		Properties prop=new Properties();
		prop.load(in);
		connection=DriverManager.getConnection(prop.getProperty("connection.url"),prop.getProperty("connection.user"),prop.getProperty("connection.password"));
		return connection;
	}
}
