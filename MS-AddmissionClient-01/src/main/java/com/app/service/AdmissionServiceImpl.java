package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.insertRepo.AdmissionRepository;
import com.app.model.Student;

@Service
public class AdmissionServiceImpl implements AdmissionServiceI {
	
	@Autowired
	AdmissionRepository ar;

	@Override
	public void saveStu(Student s) {
		
		ar.save(s);
		
	}
	

	@Override
	public Student getSingleStu(Integer id) {
		
		Optional<Student>  os = ar.findById(id);
		if(os.isPresent())
		{
			Student s = os.get();
			return s;
		}
		return null;
	}
	

	@Override
	public void updateStu(Student s) {
		
		ar.save(s);
		
	}


	@Override
	public void deleteStu(Integer id) {
		
		ar.deleteById(id);
		
	}


	@Override
	public void patchName(String name,Integer id) {

		ar.updateStudentName(name,id);
		
	}
	

}
