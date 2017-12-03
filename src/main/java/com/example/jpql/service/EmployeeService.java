package com.example.jpql.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpql.domain.Employee;

@Service
@Transactional
public class EmployeeService {

	@PersistenceContext
	EntityManager entityManager;
	
	
	public Employee selectEmployee(long id) {
		Employee emp = new Employee();
		emp = (Employee) entityManager.createQuery("select emp from Employee emp where emp.id=?1",Employee.class)
		.setParameter(1, id).getSingleResult();
		
		return emp;
		
		
	}
	
	public List<Employee> selectListEmployee() {
		Employee emp = new Employee();
		List<Employee> resultList = entityManager.createQuery("select emp from Employee emp",Employee.class)
		.getResultList();
		
		return resultList;
		
		
	}
	
	public void deleteEmployee(long id) {
		entityManager.createQuery("delete from Employee emp where emp.id=?1",Integer.class)
		.setParameter(1, id)
		.executeUpdate();
	
	}
	
	
	
}
