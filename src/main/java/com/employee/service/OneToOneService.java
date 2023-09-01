package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.model.Department;
import com.employee.model.Employee;
import com.employee.repository.DeptRepo;
import com.employee.repository.Emprepo;

@Service
public class OneToOneService {
	
	@Autowired
	Emprepo emprepo;
	
	@Autowired
	DeptRepo deptrepo;
	
	public ResponseEntity<Employee> OnetoOneMapping(Employee employee) {
		
		Department dept=employee.getDept();
		employee.setDept(dept);
		deptrepo.save(dept);
		emprepo.save(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(employee);
		
	}
	
	

}
