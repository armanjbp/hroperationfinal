package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.InterviewerController;
import com.virtusa.model.InterviewerModel;

public class InterviewerView {
	Scanner scanner = new Scanner(System.in);
	InterviewerModel interviewerModel = new InterviewerModel();

	public void interviewerView() {
		System.out.println("=======Interviewer View======");
		InterviewerView interviewerView = new InterviewerView();
		interviewerView.UpdateResult();
		
	}

	
	public void UpdateResult() {
		System.out.print("enter name : ");
		String name=scanner.nextLine();
		System.out.print("please enter marks : ");
	
		int marks = scanner.nextInt();
		
		interviewerModel.setMarks(marks);
		interviewerModel.setName(name);
		
		InterviewerController interviewerController=new InterviewerController();
		interviewerController.handleRegisterMarks(interviewerModel);
		
		
		

	}
	public void showMarksUpdated(InterviewerModel model)
	{
		System.out.println("data successfully stored : ");
		
	}
	public void marksUpdationFail(InterviewerModel model)
	{
		System.out.println("data not stored : " );
		
	}
}
