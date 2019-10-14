package com.virtusa.service;

import java.sql.SQLException;

import com.virtusa.dao.InterviewerDAO;
import com.virtusa.entities.Interviewer;
import com.virtusa.factory.FactoryInterviewerDAO;
import com.virtusa.model.InterviewerModel;

public class InterviewerServiceImpl implements InterviewerService
{
	private InterviewerDAO interviewerDAO=null;

	public InterviewerServiceImpl(InterviewerDAO interviewerDAO) {
		super();
		this.interviewerDAO = FactoryInterviewerDAO.createInterviewerDao();
	}

	public InterviewerServiceImpl() {}

	

	@Override
	public String MarksUpdate(InterviewerModel model) {
		
		
		Interviewer interviewer=new Interviewer();
		interviewer.setMarks(model.getMarks());
		interviewer.setName(model.getName());
		String result="fail";
		try {
			boolean store=interviewerDAO.storeMarks(interviewer);
			if(store)
				result="success";
			else
			{
				System.out.println("data issue ..not updatated ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	

}
