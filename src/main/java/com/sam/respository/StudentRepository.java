package com.sam.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
