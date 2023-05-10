package com.se.sm.service;

import java.util.List;

import com.se.sm.api.Student;
import com.se.sm.api.StudentDTO;

public interface StudentService {
	
	List<Student> loadStudents();
	void saveStudent(StudentDTO student);
	Student getStudent(int id);
	void updateStudent(StudentDTO studentDTO);
	void deleteStudent(int id);
	
}
