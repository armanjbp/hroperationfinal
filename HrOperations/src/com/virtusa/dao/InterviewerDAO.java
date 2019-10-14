package com.virtusa.dao;

import java.sql.SQLException;

import com.virtusa.entities.Interviewer;

public  interface InterviewerDAO 
{
public boolean storeMarks(Interviewer interviewer) throws SQLException;
}
