package com.nareshit.collections.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.collections.model.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
	
	
	//Named Query
	
	public List<Object[]> getMaxSalaryByDept(List<String> deptNames);

}
