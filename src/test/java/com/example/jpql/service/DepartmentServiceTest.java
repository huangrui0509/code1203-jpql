package com.example.jpql.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.jpql.domain.Department;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentServiceTest {
	
	@Autowired
	DepartmentService departmentService;
	
	@Test
	public void findAllDepartment() {
		List<Department> findAllDepartment = departmentService.findAllDepartment();
		System.out.println(findAllDepartment);
	}
	
	@Test
	public void findDepartmentById() {
		Department d = departmentService.findDepartmentById(123);
		System.out.println(d);
	}

}
