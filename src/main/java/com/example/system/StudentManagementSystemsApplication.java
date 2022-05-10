package com.example.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.system.entity.Student;
import com.example.system.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemsApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		 Student student1 = new Student("Shweta", "Nhearkar", "sh@gmail.com");
		  studentRepository.save(student1);
		  
		  Student student2 = new Student("Sanjana", "Jadhav", "sanjana@gmail.com");
		  studentRepository.save(student2);
		  
		  Student student3 = new Student("trisha", "shetty", "trisha@gmail.com");
		  studentRepository.save(student3);
		 
		
	}

}