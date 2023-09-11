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
  Student findById(int id);
}
