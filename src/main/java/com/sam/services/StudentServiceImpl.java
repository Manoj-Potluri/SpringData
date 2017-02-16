package com.sam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.model.Student;
import com.sam.respository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Integer id) {
		studentRepository.delete(id);
	}

	@Override
	public Student getStudent(Integer id) {
		return studentRepository.findOne(id);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
