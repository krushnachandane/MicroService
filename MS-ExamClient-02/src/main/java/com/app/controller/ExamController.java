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
import org.springframework.web.client.RestTemplate;

import com.app.model.Student;
import com.app.service.ExamServiceI;

@RestController
public class ExamController {
	
	@Autowired
	ExamServiceI es;
	
	@Autowired
	RestTemplate rt;
	
	// post Student Data Exam Client To Admission Client
	@PostMapping("/insertStuExToAdd")
	public String postExamToAdd(@RequestBody Student s)
	{
		String url="http://zuul/getadd/postStudent";
		String response =  rt.postForObject(url, s, String.class);
		return response;
	}
	
	
	//get Student Data from Admission to exam Through Their Id
	@GetMapping("/getStudent/{id}")
	public Student getStuFromAdd(@PathVariable Integer id)
	{
		String url = "http://zuul/getadd/getSingleStu/"+id;
		Student response = rt.getForObject(url,Student.class);
		return response;
	}
	
	// update student Data of admission client through Exam Client
	@PutMapping("/updateStu")
	public String updateStu(@RequestBody Student s)
	{
		String url = "http://zuul/getadd/updateStudent";
		rt.put(url, s, String.class);
		return "Update Successfully";
	}
	
	// Delete Student from admission client through exam client
	@DeleteMapping("/deleteStu/{id}")
	public String deleteStu(@PathVariable Integer id)
	{
		String url ="http://zuul/getadd/deleteStu/"+id;
		rt.delete(url);
		return "Delete Student Successfully";
	}
	
	//update perticular student data of admission client throught exam client
	@PatchMapping("/updateStuData/{id}")
	public String updateStuData(@RequestBody Student s ,@PathVariable Integer id)
	{
		String url="http://zuul/getadd/patchStuName/"+id;
			String res = rt.patchForObject(url, s, String.class);
		
			
			return res;
	}
}

