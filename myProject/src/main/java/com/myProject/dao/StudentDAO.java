package com.myProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.model.Student;

public interface StudentDAO extends JpaRepository<Student,String>{}
