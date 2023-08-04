package com.nepstaff.webappdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nepstaff.webappdemo.entity.Employee;

@Service
public class EmployeeService {

	private List<Employee> empList;
	
	public EmployeeService() {
		empList= new ArrayList<Employee>();
	}

	public void save(Employee emp) {
		empList.add(emp);
	}
	
	public void update(Employee emp) {
		// Write Code to update
	}
	
	public void delete(int empId) {
		// Write Code to delet
	}
	
	public Employee getOne(int empId) {
		// Write Code to get Employee by its id
		return null;
	}
	
	public List<Employee> getAll() {
		return empList;
	}

}
