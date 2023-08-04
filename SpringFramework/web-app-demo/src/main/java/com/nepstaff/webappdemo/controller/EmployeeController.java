package com.nepstaff.webappdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nepstaff.webappdemo.entity.Employee;
import com.nepstaff.webappdemo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/emp")
	public void save(@RequestBody Employee emp) {
		employeeService.save(emp);
	}

	@PutMapping("/emp")
	public void update(@RequestBody Employee emp) {
		employeeService.update(emp);
	}

	@DeleteMapping("/emp/{id}")
	public void delete(@PathVariable("id") int empId) {
		employeeService.delete(empId);
	}

	@GetMapping("/emp/{id}")
	public Employee getOne(@PathVariable("id") int empId) {
		return employeeService.getOne(empId);
	}

	@GetMapping("/emp")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}

}
