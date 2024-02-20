package com.sonu.collections.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sonu.collections.model.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {


    //Named Query

    List<Object[]> getMaxSalaryByDept(List<String> deptNames);

    List<Object[]> getDeptAndSalWhoseSalIsGreaterThanProvided(Integer salary);


    Object[] getDeptAndSalWhoseSalIsGreaterThanProvidedAnotherWay(Integer salary);


}
