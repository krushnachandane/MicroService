package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.AdmissionServiceI;
@RestController
public class AdmissionController {
	
	@Autowired
	AdmissionServiceI as;
	
	@PostMapping("/postStudent")
	public String insertStu(@RequestBody Student s)
	{
		as.saveStu(s);
		
		return "Your Addmission Successful";
	}
	
	
	//get Single Student
	
	@GetMapping("/getSingleStu/{id}")
	public Student getStu(@PathVariable Integer id)
	{
			Student stu = as.getSingleStu(id);
			
		return	stu;
	}
	
	
	// Update All Data of Student using put Method
	
	@PutMapping("/updateStudent")
	public void updateStudent(@RequestBody Student s)
	{
		as.updateStu(s);
	}
	
	
	// Delete Perticular Student through their Id
	
	@DeleteMapping("/deleteStu/{id}")
	public String deleteStudent(@PathVariable Integer id)
	{
		as.deleteStu(id);
		
		return "Data Delete Successfully";
	}
	
	
	// update Studnet Data through their Id
	// update Student Name
	
	@PatchMapping("/patchStuName/{id}")
	public String patchStudentName(@PathVariable Integer id , @RequestBody Student s)
	{
		as.patchName(s.getName(),id);
		
		return "Name Update Successfully";
	}
}
