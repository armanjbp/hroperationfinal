package com.virtusa.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Testcon {
	private static DataSource dataSource = new DataSource();

	public static void main(String args[]) 
	{
		try {
			Class.forName(dataSource.getDriver());
			
			Connection conn = DriverManager.getConnection(dataSource.getUrl(),
					dataSource.getUsername(), dataSource.getPassword());
			
				PreparedStatement preparedStatement= conn.prepareStatement("insert into interviewer values(?,?)");
			preparedStatement.setString(1, "abdul");
			preparedStatement.setInt(2, 30);
		
		int rows=	preparedStatement.executeUpdate();
		if(rows>0)
		{
			System.out.print("success");
		}
		else
		{
			System.out.print("error");			
		}
			
			
			
//			Statement stmt= conn.createStatement();
//		ResultSet rs=	stmt.executeQuery("insert into interviewer values(?,?)");
//		while(rs.next())
//		{
//			System.out.print(rs.getString(1)+" "+rs.getInt(2));
//		}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

		}
