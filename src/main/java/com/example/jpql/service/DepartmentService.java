package com.example.jpql.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpql.domain.Department;

@Service
@Transactional

public class DepartmentService {

	@PersistenceContext
	EntityManager entityManager;
	
	
	public List<Department> findAllDepartment(){
		
		List<Department> resultList = entityManager.createNamedQuery("findAll",Department.class)
		.getResultList();
		return resultList;
	}
	
	
public Department findDepartmentById(long id){
		
		return entityManager.createNamedQuery("findById",Department.class)
		.setParameter(1, id)
		.getSingleResult();
		
		
	}
	
}
