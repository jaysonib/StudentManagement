package com.se.sm.dao;

import java.util.List;

import com.se.sm.api.Student;
import com.se.sm.api.StudentDTO;

public interface StudentDAO {
	List<Student> loadStudents(); 
	void saveStudent(StudentDTO studentDTO);
	Student getStudent(int id);
	void updateStudent(StudentDTO studentDTO);
	void deleteStudent(int id);
}
