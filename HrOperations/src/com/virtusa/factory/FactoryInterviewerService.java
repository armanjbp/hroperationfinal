package com.virtusa.factory;

import com.virtusa.dao.InterviewerDAO;
import com.virtusa.dao.InterviewerDAOImpl;
import com.virtusa.service.InterviewerService;
import com.virtusa.service.InterviewerServiceImpl;

public class FactoryInterviewerService 
{
	public static InterviewerDAO createInterviewerDAO(){
		InterviewerDAO interviewerDAO=new InterviewerDAOImpl();
		return interviewerDAO;
	}
public static InterviewerService createInterviewerService()
{
	
	InterviewerService interviewerService=new InterviewerServiceImpl(null);
			return interviewerService;
}
	

}
