package com.myProject.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myProject.dao.StudentDAO;
import com.myProject.model.Student;
import com.myProject.util.Validation;

@RestController
@RequestMapping("Student")
public class StudentController {
	@Autowired
	private StudentDAO studentDAO;
	
	
	@PostMapping("/students")
	public ResponseEntity save(@RequestBody Student student) {
		if(Validation.RutValidation(student.getRut()) && (student.getAge() > 18)) {
			studentDAO.save(student);
			return new ResponseEntity(HttpStatus.CREATED);
		}
		else
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
			
	}
	
	@GetMapping("/students")
	public List<Student> listAll() {
		return studentDAO.findAll();
	}
	
	@GetMapping("/students/{rut}")
	public Optional<Student> listbyCode(@PathVariable("rut") String rut) {
		return studentDAO.findById(rut);
	}
	
	@DeleteMapping("/students/{rut}")
	public void delete(@PathVariable("rut") String rut) {
		studentDAO.deleteById(rut);
	}
	
	@PutMapping("/students")
	public void update(@RequestBody Student student) {
		studentDAO.save(student);
	}
	
}
