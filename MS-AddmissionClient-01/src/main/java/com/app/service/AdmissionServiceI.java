package com.app.service;

import com.app.model.Student;

public interface AdmissionServiceI {
	
	
	

	void saveStu(Student s);

	Student getSingleStu(Integer id);

	void updateStu(Student s);

	void deleteStu(Integer id);

	void patchName( String name , Integer id);


}
