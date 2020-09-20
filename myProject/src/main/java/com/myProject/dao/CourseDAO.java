package com.myProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.model.Course;


public interface CourseDAO extends JpaRepository<Course,String>{}
