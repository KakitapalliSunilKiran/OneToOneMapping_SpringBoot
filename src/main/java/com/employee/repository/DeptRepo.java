package com.employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.Department;

@Repository
public interface DeptRepo extends CrudRepository<Department,Integer>{

}
