package com.se.sm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.se.sm.api.Student;
import com.se.sm.api.StudentDTO;
import com.se.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudents() {
		//

		String sql = "SELECT * FROM students;";
		List<Student> studentList = jdbcTemplate.query(sql, new StudentRowMapper());

		return studentList;
	}

	@Override
	public void saveStudent(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		Object[] args = { studentDTO.getName(), studentDTO.getMobile(), studentDTO.getCountry() };
		String sql = "INSERT INTO STUDENTS(NAME, MOBILE, COUNTRY) VALUES(?,?,?)";
		jdbcTemplate.update(sql, args);
		System.out.println("1 record inserted..");
	}

	@Override
	public Student getStudent(int id) {
		String sql = "SELECT * FROM STUDENTS WHERE ID = ?";
		
		Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
		return student;
	}

	@Override
	public void updateStudent(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		String sql = "UPDATE STUDENTS SET NAME = ?, MOBILE = ?, COUNTRY = ? WHERE ID = ?";
		Object[] args = {studentDTO.getName(), studentDTO.getMobile(), studentDTO.getCountry(), studentDTO.getId()};
		jdbcTemplate.update(sql, args);
		System.out.println("one record updated....");
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM STUDENTS WHERE ID = ?";
		jdbcTemplate.update(sql, id);
		System.out.println("one record deleted..");
		
	}

}
