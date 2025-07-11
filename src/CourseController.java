package com.tnsif.CourseModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	//specific record
	@GetMapping("/course/{id}")
	public Course getCourseById(@PathVariable Long id) {
		return service.getCourseById(id);
	}
	//update
	@PutMapping("/course/{id}")
	public Course updateCourseById(@PathVariable Long id,@RequestBody Course course) {
		return service.updateCourse(id,course);
	}
	//delete
	@DeleteMapping("/course/{id}")
	public void deleteCourse(@PathVariable Long id) {
		service.deleteCourse(id);
		
	}

	
	
}
