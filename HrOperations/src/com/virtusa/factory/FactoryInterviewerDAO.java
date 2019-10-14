package com.virtusa.factory;

import com.virtusa.dao.InterviewerDAO;
import com.virtusa.dao.InterviewerDAOImpl;

public class FactoryInterviewerDAO
{
	public static InterviewerDAO createInterviewerDao()
	{
		InterviewerDAO interviewerDAO=new InterviewerDAOImpl();
		return interviewerDAO;
	}
	

}
