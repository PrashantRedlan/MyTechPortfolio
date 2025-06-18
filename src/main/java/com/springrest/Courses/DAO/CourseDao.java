package com.springrest.Courses.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.Courses.entity.Course;

public interface CourseDao extends JpaRepository<Course ,Long> { 
	
	
	

}
