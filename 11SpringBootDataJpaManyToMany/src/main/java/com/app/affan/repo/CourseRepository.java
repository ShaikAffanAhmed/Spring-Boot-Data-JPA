package com.app.affan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.affan.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
