package com.briz.demoservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServImpl implements StudentService
{
	@Autowired
	StudentRepository srepo;
	
public String addStudent(Student s)
{
srepo.save(s);  // calling the repository method
return "student saved into database";
}
public List<Student> listStudent()
{
	return srepo.findAll();
}
}
