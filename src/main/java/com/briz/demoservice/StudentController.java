package com.briz.demoservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
@Autowired
StudentService sserv;
@RequestMapping("/save")
	public Student add(@RequestBody Student student)
	{
		return sserv.addStudent(student);
	}

@RequestMapping("/list")
public List<Student> allstudents()
{
	return sserv.listStudent();// calling the service method 
}

@RequestMapping("/by/{name}")
public List<Student> byname(@PathVariable String name)
{
	return sserv.getByName(name);
}
	@RequestMapping("/{age}")
	public List<Student> byage(@PathVariable int age)
	{
		return sserv.getByAge(age);
	}
}
