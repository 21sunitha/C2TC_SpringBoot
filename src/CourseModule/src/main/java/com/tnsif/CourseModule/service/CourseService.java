package com.tnsif.CourseModule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.CourseModule.entity.Course;
import com.tnsif.CourseModule.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
	//to save the record
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
		
	}

	//to retrive all records
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}
}
