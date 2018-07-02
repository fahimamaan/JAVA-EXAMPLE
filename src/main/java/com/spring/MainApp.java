package com.spring;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.Entity.Course;
import com.spring.Repo.CourseRepo;

@SpringBootApplication
public class MainApp implements CommandLineRunner {

	private Logger log= org.slf4j.LoggerFactory.getLogger(this.getClass());
	

	
	@Autowired
	CourseRepo courseRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Course course=courseRepo.findByid(11L);
		Course c=new Course();
		c.setAge(10);
		c.setName("amaan");
		courseRepo.save(c);
		log.info(course.toString());
		System.out.println("ukjhhhhhhhhhhhh");
		java.util.List<Course> courses= courseRepo.findAll();
		
		log.info(courses.toString());
		
		
		
		
	}
}
