package com.tnsif.CourseModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.CourseModule.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
