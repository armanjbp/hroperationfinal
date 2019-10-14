package com.virtusa.repository;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Interviewer;

public class InterviewerRepository {
	private static List<Interviewer> interviewerData=new ArrayList<Interviewer>();

	public static boolean add(Interviewer interviewer){
		
		return interviewerData.add(interviewer);
	}
	public static List<Interviewer> get(){
		return interviewerData;
}
}