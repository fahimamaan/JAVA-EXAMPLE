package com.spring.Repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.Entity.Course;


@Transactional
@Repository
public class CourseRepo {
  
	@Autowired
	EntityManager entityManager;
	
	public void save(Course course) {
		
		entityManager.persist(course);
	}
	
	public Course findByid(Long id) {
		
		return entityManager.find(Course.class, id);
	}
	
	public List<Course> findAll(){
		
		 Query b=entityManager.createQuery("Select c from Course c");
		         System.out.println(b.getMaxResults()+"ma fhfk;");
		        @SuppressWarnings("unchecked")
				List<Course> l= b.getResultList();
		        
		return l;
	}
}
