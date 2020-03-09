package com.example.Employee_Crud.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Employee_Crud.entity.Employee;
import com.example.Employee_Crud.exception.EmployeeException;


public interface IEmployeeDao {
	
	 public Employee addEmployee(Employee employee) throws EmployeeException;
	 
	 public Employee getEmployee(int empid) throws EmployeeException;
	 
	 public List<Employee> getAllEmployees();
	 
	 public Employee updateEmployee(Employee employee) throws EmployeeException;
	 
	 public boolean deleteEmployee(int empId) throws EmployeeException;
	 
	 
	 

}
