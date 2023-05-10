package com.se.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.sm.api.Student;
import com.se.sm.api.StudentDTO;
import com.se.sm.dao.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDao;
	
	@Override
	public List<Student> loadStudents() {
		
		List<Student> loadStudents = studentDao.loadStudents();
		return loadStudents;
	}

	@Override
	public void saveStudent(StudentDTO student) {
		// TODO Auto-generated method stub
		
		studentDao.saveStudent(student);
		if(student.getCountry().equalsIgnoreCase("Canada")) {
			System.out.println("Bonjour...");
		}
	}

	@Override
	public Student getStudent(int id) {
		
		return studentDao.getStudent(id);
	}

	@Override
	public void updateStudent(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		studentDao.updateStudent(studentDTO);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentDao.deleteStudent(id);
	}
	

}
