package com.example.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvc.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
