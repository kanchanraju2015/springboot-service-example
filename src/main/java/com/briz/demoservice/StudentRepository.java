package com.briz.demoservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>
{
List<Student> findByName(String name);
List<Student> findByAge(int age);
List<Student> findByAddress(String address);


String deleteById(int id);

  Student findById(int id);
  List<Student> findByNameAndAddress(String name,String address);
  List<Student> findByNameAndAge(String name,int age);

}
