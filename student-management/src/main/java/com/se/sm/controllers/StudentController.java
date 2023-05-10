package com.se.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.se.sm.api.Student;
import com.se.sm.api.StudentDTO;
import com.se.sm.dao.StudentDAO;
import com.se.sm.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/showStudent")
	public String showStudentPage(Model model) {
		System.out.println("============================");
		// call the service layer
		List<Student> studentList = studentService.loadStudents();
		model.addAttribute("students", studentList);
		return "student-list";
	}
	
	@GetMapping("/showAddStudentPage")
	public String addStudentPage(Model model) {
		StudentDTO studentDTO = new StudentDTO();
		model.addAttribute("student", studentDTO);
		return "add-student";
	}
	
	@PostMapping("/save-student")
	public String saveStudent(StudentDTO studentDTO) {
		System.out.println(studentDTO);
		// do a condition check if the user is already exists
		if(studentDTO.getId() == 0) {
			// if id is 0 then insert into db.
			studentService.saveStudent(studentDTO);
		}else {
			studentService.updateStudent(studentDTO);
		}
		
		
		return "redirect:/showStudent";
	}
	
	@ResponseBody
	@GetMapping("/thankyou")
	public String thankYou() {
		return "thank you....";
	}
	
	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId") int id, Model model) {
		// give the user details who clicked the update button
		System.out.println("looking data for the id "+ id);
		Student student1 = studentService.getStudent(id);
		model.addAttribute("student", student1);
		return "add-student";
	}
	
	@GetMapping("/deleteStudent") 
	public String deleteStudent(@RequestParam("userId") int id) {
		studentService.deleteStudent(id);
		return "redirect:/showStudent";
	}
	
}
