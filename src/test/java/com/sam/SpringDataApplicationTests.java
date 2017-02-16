package com.sam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sam.model.Student;
import com.sam.respository.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void createStudent() {
		Student student = new Student();
		student.setName("abc");
		student.setEmailId("abc@email");
		student.setPhone(12345L);

		studentRepository.save(student);
	}

}
