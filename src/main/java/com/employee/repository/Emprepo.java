package com.employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public interface Emprepo extends CrudRepository<Employee,Integer> {

}
