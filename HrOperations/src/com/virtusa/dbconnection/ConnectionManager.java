package com.virtusa.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
	private static DataSource dataSource = new DataSource();
	private static Connection connection = null;

	public static Connection openConnection() {

		try {
			Class.forName(dataSource.getDriver());
			connection = DriverManager.getConnection(dataSource.getUrl(),
					dataSource.getUsername(), dataSource.getPassword());

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return connection;

	}

	public void closeConnection() throws SQLException {
		connection.close();
	}



}
