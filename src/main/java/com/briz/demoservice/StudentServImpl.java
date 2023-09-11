package com.briz.demoservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServImpl implements StudentService
{
	@Autowired
	StudentRepository srepo;
	
public Student addStudent(Student s)
{
srepo.save(s);  // calling the repository method
return s;
}
public List<Student> listStudent()
{
	return srepo.findAll();
}
@Override
public List<Student> getByName(String name) {
	return srepo.findByName(name);
}
@Override
public List<Student> getByAge(int age) {
	return srepo.findByAge(age);
}
@Override
public List<Student> getByAddress(String address) {
return srepo.findByAddress(address);
}
@Override
public Student getById(int id) {
	Student student=srepo.findById(id);
	return student;
}
}
