package com.example.jpql.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.jpql.domain.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest { 

	@Autowired
	EmployeeService employeeService;
	
	@Test
	public void selectEmployee() {
		Employee selectEmployee = employeeService.selectEmployee(12);
		System.out.println(selectEmployee);
	}
	
	@Test
	public void selectListEmployee() {
		List<Employee> selectListEmployee = employeeService.selectListEmployee();
		System.out.println(selectListEmployee);
	}
	
}
