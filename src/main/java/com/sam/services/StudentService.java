package com.sam.services;

import java.util.List;

import com.sam.model.Student;

public interface StudentService {

	Student createStudent(Student student);

	Student updateStudent(Student student);

	void deleteStudent(Integer id);
	
	Student getStudent(Integer id);
	
	List<Student> getAllStudents();

}
