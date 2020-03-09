package com.example.Employee_Crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee_Crud.entity.Employee;
import com.example.Employee_Crud.exception.EmployeeException;
import com.example.Employee_Crud.service.IEmployeeService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmployeeController {


	@Autowired
	IEmployeeService service;



	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) 
	{
		try {

			return service.addEmployee(employee);

		} 
		catch (EmployeeException e) {

			System.out.println(e.getMessage());
		}
		return employee;

	}
	

	@GetMapping("/getEmployee/{empid}")
	public Employee getEmployee(@PathVariable int empid) {


		Employee emp=null;

		try {
			emp=service.getEmployee(empid);

		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
		}
		return emp;

	}


	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees()
	{

		return service.getAllEmployees();

	}



	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		Employee emp=null;
		try {
			emp = service.updateEmployee(employee);
		} catch (EmployeeException e) {

			System.out.println(e.getMessage());
		}
		return emp;

	}


	
	@DeleteMapping("/deleteEmployee/{empId}")
	public boolean deleteEmployee(@PathVariable int empId)
	{
		try {
			return service.deleteEmployee(empId);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
			return false;
		}


	}



}