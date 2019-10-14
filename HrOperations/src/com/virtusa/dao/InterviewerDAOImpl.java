package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.virtusa.dbconnection.ConnectionManager;
import com.virtusa.entities.Interviewer;
import com.virtusa.repository.InterviewerRepository;

public class InterviewerDAOImpl implements InterviewerDAO {
	public boolean storeMarks(Interviewer interviewer) throws SQLException {
		Connection connection = ConnectionManager.openConnection();
		PreparedStatement preparedStatement = connection
				.prepareStatement("insert into interviewer values(?,?)");
		preparedStatement.setString(1, interviewer.getName());
		preparedStatement.setInt(2, interviewer.getMarks());
		
		int rows = preparedStatement.executeUpdate();
		if (rows >0) {
			return true;
		} else
			return false;

	}

}
