package com.myProject.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myProject.dao.CourseDAO;
import com.myProject.model.Course;

@RestController
@RequestMapping("Course")
public class CourseController {
	@Autowired
	private CourseDAO courseDAO;
	
	
	@PostMapping("/courses")
	public void save(@RequestBody Course course) {
		courseDAO.save(course);
	}
	
	@GetMapping("/courses")
	public List<Course> listAll() {
		return courseDAO.findAll();
	}
	
	@GetMapping("/courses/{code}")
	public Optional<Course> listbyCode(@PathVariable("code") String code) {
		return courseDAO.findById(code);
	}
	
	@DeleteMapping("/courses/{code}")
	public void delete(@PathVariable("code") String code) {
		courseDAO.deleteById(code);
	}
	
	@PutMapping("/courses")
	public void update(@RequestBody Course course) {
		courseDAO.save(course);
	}
	
}
