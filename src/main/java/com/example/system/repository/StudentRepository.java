package com.example.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.system.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}