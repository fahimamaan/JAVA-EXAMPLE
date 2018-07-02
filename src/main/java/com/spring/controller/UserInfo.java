package com.spring.controller;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Entity.Course;
import com.spring.Repo.CourseRepo;

@RestController
@RequestMapping("/user")
public class UserInfo {
	@Autowired
	CourseRepo courseRepo;
	
	@GetMapping("/userinfo")
	public List<Course> getCOurse() {
		
		return courseRepo.findAll();
	}
	
	
}
