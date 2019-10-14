package com.virtusa.controller;

import com.virtusa.factory.FactoryInterviewerService;
import com.virtusa.model.InterviewerModel;
import com.virtusa.service.InterviewerService;
import com.virtusa.view.InterviewerView;

public class InterviewerController 
{
	private InterviewerService interviewerService;
	InterviewerView interviewerView=new InterviewerView();

	public InterviewerController() {
		
		this.interviewerService = FactoryInterviewerService.createInterviewerService();
	}
	public void handleRegisterMarks(InterviewerModel model)
	{
		interviewerService.MarksUpdate(model);
		String outcome=interviewerService.MarksUpdate(model);
		if(outcome.contentEquals("success"))
		{
			interviewerView.showMarksUpdated(model);
		}
		else
		{
			interviewerView.marksUpdationFail(model);
		}
	}
	

}
