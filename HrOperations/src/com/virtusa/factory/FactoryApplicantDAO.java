package com.virtusa.factory;

import com.virtusa.dao.ApplicantDAO;
import com.virtusa.dao.ApplicantDAOImpl;

public class FactoryApplicantDAO {
	public static ApplicantDAO createStudentDAO(){
	ApplicantDAO applicantDAO=new ApplicantDAOImpl();
	return applicantDAO;
	}
}
