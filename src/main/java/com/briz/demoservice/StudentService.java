package com.briz.demoservice;

import java.util.List;

public interface StudentService
{
public Employee addStudent(Student student);
public List<Student> listStudent();
  List<Student> getByName(String name);
  List<Student> getByAge(int age);
  List<Student> getByAddress(String address);

}
