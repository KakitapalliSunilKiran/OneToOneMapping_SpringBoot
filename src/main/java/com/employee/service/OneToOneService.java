package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	public void OnetoOneMapping(Employee employee) {
		System.out.println("*********************************"+employee.getEmpid());
		Department dept=employee.getDept();
		
		employee.setDept(dept);
		System.out.println(dept.getDeptId()+"***********"+dept.getName());
		deptrepo.save(dept);
		emprepo.save(employee);
		
	}

}
