package com.briz.demoservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
@Autowired
StudentService sserv;
@RequestMapping("/test")
public String test()
{
	Student s=new Student();
	s.setAddress("lalpur");
	s.setAge(90);
	s.setName("chandan");
	sserv.addStudent(s);// calling the service layer with student object
	return "this is service test";
}
@RequestMapping("/list")
public List<Student> allstudents()
{
	return sserv.listStudent();// calling the service method 
}
}
