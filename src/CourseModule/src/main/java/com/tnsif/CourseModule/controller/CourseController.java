package com.tnsif.CourseModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tnsif.CourseModule.entity.Course;
import com.tnsif.CourseModule.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	//insert
	@PostMapping("/course")
	public Course createCourse(@RequestBody Course course) {
		return service.saveCourse(course);
	}
	@GetMapping("/course")
	public List<Course> getAllCourses(){
		return service.getAllCourses();
		
	}
	
	

	
	
}
