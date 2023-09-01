package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.OneToOneService;

@RestController
@RequestMapping("api/v3")
public class OneToOneController {
	
	@Autowired
	OneToOneService onetoOneService;
	
	/*
	 * {
		    "empid":"15",
		    "name":"sunil",
		    "salary":300000,
		    "dept":{
		        "deptId":26,
		        "name":"Engineering"
		    }
		}
	 */
	
	@PostMapping("/onetoone")
	public ResponseEntity<Employee> MapOnetoOne(@RequestBody Employee employee) {
		onetoOneService.OnetoOneMapping(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(employee);
	}
	
	

}
